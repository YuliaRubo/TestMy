package com.example.TrainMy.DAO.teacher;

import com.example.TrainMy.DTO.TeacherDTO;

import com.example.TrainMy.DTO.TeacherDTOInsert;
import com.example.TrainMy.DTO.TeacherWithListStringCourseDTO;
import com.example.TrainMy.rowMapper.RowMapperTeacher;
import com.example.TrainMy.rowMapper.RowMapperTeacherNew;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Repository
public class TeacherDAOImpl implements TeacherDAO{

    public NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Autowired
    public TeacherDAOImpl(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }

    public final String GET_TEACHER_BY_ID= "SELECT*FROM TEACHER  WHERE teacher_id=:teacher_id";
    public final String GET_TEACHER_BY_NAME= "SELECT*FROM TEACHER  WHERE last_name=:last_name";
    public final String GET_ALL_TEACHER= "SELECT*FROM TEACHER";
    //Удаляем учителя и курс вместе,КАК????
    public final String DELETE_TEACHER_BY_ID= "DELETE FROM TEACHER WHERE teacher_id=:teacher_id";
    public final String INSERT_TO_TABLE_TEACHER = " INSERT INTO TEACHER (first_name, last_name) values (:first_name, :last_name)";
    public final String UPDATE_TEACHER = " UPDATE TEACHER SET first_name = :first_name, last_name = :last_name  where teacher_id=teacher_id";
    public final String GET_TEACHER_WITH_COURSE = "select teacher.teacher_id, teacher.first_name, teacher.last_name, course.course_id, course.name_course"+
                                                  " from teacher  join course on teacher.teacher_id = course.teacherId"+
                                                   " where teacher_id=:teacher_id";
    public final  String GET_COURSE_ID_NAME_COURSE_TEACHER_ID_BY_TEACHER_ID = "select  COURSE.COURSE_ID , teacher.teacher_id, " +
            "teacher.first_name, teacher.last_name from STUDENT_AND_COURSE " +
            "join COURSE  on STUDENT_AND_COURSE.COURSE_ID  = COURSE.COURSE_ID " +
            "join TEACHER  on COURSE.TEACHERID =TEACHER.TEACHER_ID " +
            "where TEACHERID = :TEACHERID";


    @Override
    public TeacherDTO getTeacherById(int teacherId) {
        Map<String,Object> param = new HashMap<>();
        param.put("teacher_id", teacherId);
        return namedParameterJdbcTemplate.queryForObject(GET_TEACHER_BY_ID, param, new RowMapperTeacher());
    }

    @Override
    public void deleteById(int teacherId) {
        Map<String,Object> param = new HashMap<>();
        param.put("teacher_id", teacherId);
        namedParameterJdbcTemplate.update(DELETE_TEACHER_BY_ID, param);
    }


    @Override
    public void insertTeacher(TeacherDTOInsert teacherDTOInsert) {
        SqlParameterSource sqlParameterSource = new MapSqlParameterSource()
                .addValue("first_name" , teacherDTOInsert.getFirstNameTeacher())
                .addValue("last_name", teacherDTOInsert.getLastNameTeacher());
       namedParameterJdbcTemplate.update(INSERT_TO_TABLE_TEACHER, sqlParameterSource);
    }

    @Override
    public void updateTeacher(TeacherDTOInsert teacherDTOInsert) {
        SqlParameterSource sqlParameterSource = new MapSqlParameterSource()
                .addValue("teacher_id", teacherDTOInsert.getTeacherId())
                .addValue("first_name", teacherDTOInsert.getFirstNameTeacher())
                .addValue("last_name", teacherDTOInsert.getLastNameTeacher());
        namedParameterJdbcTemplate.update(UPDATE_TEACHER, sqlParameterSource);
    }

    @Override
    public List<TeacherDTO> getTeacherAll() {
        List<TeacherDTO> listT = namedParameterJdbcTemplate.query(GET_ALL_TEACHER, new RowMapperTeacher());
        return listT;
    }
    @Override
    public List<TeacherWithListStringCourseDTO> getTeacherAllList() {
        List<TeacherWithListStringCourseDTO> listT = namedParameterJdbcTemplate.query(GET_ALL_TEACHER, new RowMapperTeacherNew());
        return listT;
    }


//    @Override
//    public TeacherDTO getTeacherByName(String name) {
//        Map<String, Object>param = new HashMap<>();
//        param.put("last_name", name);
//        return namedParameterJdbcTemplate.query(GET_TEACHER_BY_NAME, param, new RowMapperTeacher());
//    }

}
