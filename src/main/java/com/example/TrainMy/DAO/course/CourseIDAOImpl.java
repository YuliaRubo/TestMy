package com.example.TrainMy.DAO.course;

import com.example.TrainMy.DTO.*;
import com.example.TrainMy.rowMapper.RowMapperCourse;
import com.example.TrainMy.rowMapper.RowMapperTeacher;
import com.example.TrainMy.rowMapper.RowMapperUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CourseIDAOImpl implements CourseDAO {

    public NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    public CourseIDAOImpl(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    public final String GET_ID = "SELECT *  FROM COURSE WHERE course_id=:course_id";
    public final String GET_COURSES_BY_TEACHER_ID = "SELECT * FROM COURSE WHERE teacherId = :teacherId";
    public final String DELETE_COURSE_BY_ID_TEACHER = "DELETE FROM COURSE WHERE teacherId = :teacherId";
    public final String GET_COURSE_BY_USER_ID = "select * from course where course_id in " +
            "(select course_id from  student_and_course where student_id = :student_id)";
    public final String INSERT_TO_TABLE_COURSE = "INSERT INTO COURSE (name_course, teacherId) values (:name_course, :teacherId)";
    public final String INSERT_STUDENT_TO_COURSE = "insert into STUDENT_AND_COURSE (COURSE_ID, STUDENT_ID) values (:course_id, :student_id)";
    public final String UPDATE_COURSE = " UPDATE Course SET name_course = :name_course where course_id=:course_id";

    @Override
    public void insertStudentToCourse(StudentGoToCourseDTOInsert studentGoToCourseDTOInsert) {
        SqlParameterSource sqlParameterSource = new MapSqlParameterSource()
                .addValue("course_id", studentGoToCourseDTOInsert.getCourseId())
                .addValue("student_id", studentGoToCourseDTOInsert.getStudentId());
        namedParameterJdbcTemplate.update(INSERT_STUDENT_TO_COURSE, sqlParameterSource);
    }

    @Override
    public void updateCourse(CourseDTOInsert courseDTO) {
        SqlParameterSource sqlParameterSource = new MapSqlParameterSource()
                .addValue("course_id", courseDTO.getCourseId() )
                .addValue("teacherId", courseDTO.getTeacherId())
                .addValue("name_course", courseDTO.getNameCourse());
        namedParameterJdbcTemplate.update(UPDATE_COURSE, sqlParameterSource);
    }

    @Override
    public List<CourseDTO> getCourseByTeacherID(int teacherId) {
        Map<String, Object> params = new HashMap<>();
        params.put("teacherId", teacherId);
        return namedParameterJdbcTemplate.query(GET_COURSES_BY_TEACHER_ID, params, new RowMapperCourse());
    }

    @Override
    public void insertCourse(CourseDTOInsert courseDTO) {
        SqlParameterSource sqlParameterSource = new MapSqlParameterSource()
        .addValue("teacherId", courseDTO.getTeacherId())
        .addValue("name_course", courseDTO.getNameCourse());
        namedParameterJdbcTemplate.update(INSERT_TO_TABLE_COURSE, sqlParameterSource);
    }



    @Override
    public CourseDTO getCourseById(int courseId) {
        Map<String, Object> params = new HashMap<>();
        params.put("course_id", courseId);
        return namedParameterJdbcTemplate.queryForObject(GET_ID, params, new RowMapperCourse());
    }

    @Override
    public void delete(int teacherId) {
        Map<String, Object> params = new HashMap<>();
        params.put("teacherId", teacherId);
        namedParameterJdbcTemplate.update(DELETE_COURSE_BY_ID_TEACHER, params);
    }

    @Override
    public List<CourseDTO> getCoursesByUserId(int id) {
        Map<String, Object> params = new HashMap<>();
        params.put("student_id", id);
        return namedParameterJdbcTemplate.query(GET_COURSE_BY_USER_ID, params, new RowMapperCourse());
    }

}

