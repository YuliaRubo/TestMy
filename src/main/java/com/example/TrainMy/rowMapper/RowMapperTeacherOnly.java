package com.example.TrainMy.rowMapper;

import com.example.TrainMy.DTO.TeacherDTO;
import com.example.TrainMy.DTO.TeacherDTOOnly;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperTeacherOnly implements RowMapper<TeacherDTOOnly> {
    @Override
    public TeacherDTOOnly mapRow(ResultSet rs, int rowNum) throws SQLException {
        TeacherDTOOnly teacherDTO = new TeacherDTOOnly();
        teacherDTO.setTeacherId(rs.getInt("teacher_id"));
        teacherDTO.setFirstNameTeacher(rs.getString("first_name"));
        teacherDTO.setLastNameTeacher(rs.getString("last_name"));
        return teacherDTO;
        }

}