package com.example.TrainMy.rowMapper;

import com.example.TrainMy.DTO.CourseDTO;
import com.example.TrainMy.DTO.TeacherDTO;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RowMapperTeacher implements RowMapper<TeacherDTO> {
    @Override
    public TeacherDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
                TeacherDTO teacherDTO = new TeacherDTO();
                teacherDTO.setTeacherId(rs.getInt("teacher_id"));
                teacherDTO.setFirstNameTeacher(rs.getString("first_name"));
                teacherDTO.setLastNameTeacher(rs.getString("last_name"));
        return teacherDTO;
    }
}