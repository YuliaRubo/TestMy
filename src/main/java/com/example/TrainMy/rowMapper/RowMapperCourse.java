package com.example.TrainMy.rowMapper;

import com.example.TrainMy.DTO.CourseDTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperCourse implements RowMapper<CourseDTO> {
    @Override
    public CourseDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        CourseDTO courseDTO = new CourseDTO();
        courseDTO.setCourseId(rs.getInt("course_id"));
        courseDTO.setNameCourse(rs.getString("name_course"));
        return courseDTO;
    }
}
