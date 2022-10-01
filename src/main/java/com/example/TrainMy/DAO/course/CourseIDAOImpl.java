package com.example.TrainMy.DAO.course;

import com.example.TrainMy.DTO.CourseDTO;
import com.example.TrainMy.DTO.CourseWithTeacherDTO;
import com.example.TrainMy.DTO.UserDTO;
import com.example.TrainMy.rowMapper.RowMapperCourse;
import com.example.TrainMy.rowMapper.RowMapperUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CourseIDAOImpl implements CourseDAO{

    public NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Autowired
    public CourseIDAOImpl(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    public final String GET_ID = "SELECT *  FROM COURSE WHERE course_id=:course_id";
    public  final String DELETE_COURSE_BY_ID_TEACHER = "DELETE FROM COURSE WHERE teacher_id = :teacher_id";
    public final String GET_COURSE_WITH_TEACHER = "";

    @Override
    public CourseDTO getCourseById(int courseId) {
        Map<String, Object> params  = new HashMap<>();
        params.put("course_id", courseId);
        return namedParameterJdbcTemplate.queryForObject(GET_ID, params, new RowMapperCourse());
    }

    @Override
    public CourseWithTeacherDTO getCourseByIdWithTeacher(int courseId) {
        return null;
    }


    @Override
    public void delete(int teacherId) {
        Map<String, Object> params  = new HashMap<>();
        params.put("teacherId", teacherId);
        namedParameterJdbcTemplate.update(DELETE_COURSE_BY_ID_TEACHER, params);
    }

}

