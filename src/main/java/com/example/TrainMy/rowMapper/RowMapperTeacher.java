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

public class RowMapperTeacher implements ResultSetExtractor<TeacherDTO> {
    @Override
    public TeacherDTO extractData(ResultSet rs) throws SQLException, DataAccessException {
        TeacherDTO teacherDTO = new TeacherDTO();
        while (rs.next()) {
            if (teacherDTO.getTeacherId() == 0) {
                teacherDTO.setTeacherId(rs.getInt("teacher_id"));
                teacherDTO.setFirstNameTeacher(rs.getString("first_name"));
                teacherDTO.setLastNameTeacher(rs.getString("last_name"));
            }
            CourseDTO courseDTO = new CourseDTO();
            courseDTO.setCourseID(rs.getInt("course_id"));
            courseDTO.setNameCourse(rs.getString("name_course"));
            List<CourseDTO> courseDTOList = teacherDTO.getCourseList();
            courseDTOList.add(courseDTO);
            teacherDTO.setCourseList(courseDTOList);
        }
        return teacherDTO;

    }
}