package com.example.TrainMy.rowMapper;

import com.example.TrainMy.DAO.teacher.TeacherDAO;
import com.example.TrainMy.DTO.TeacherWithListStringCourseDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperTeacherNew implements RowMapper<TeacherWithListStringCourseDTO> {
    @Override
    public TeacherWithListStringCourseDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        TeacherWithListStringCourseDTO teacherWithListStringCourseDTO= new TeacherWithListStringCourseDTO();
        teacherWithListStringCourseDTO.setTeacherId(rs.getInt("teacher_id"));
        teacherWithListStringCourseDTO.setFirstNameTeacher(rs.getString("first_name"));
        teacherWithListStringCourseDTO.setLastNameTeacher(rs.getString("last_name"));
        return teacherWithListStringCourseDTO;
    }
}
