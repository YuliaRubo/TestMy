package com.example.TrainMy.DAO.teacher;

import com.example.TrainMy.DTO.TeacherDTO;
import com.example.TrainMy.DTO.TeacherDTOOnly;
import com.example.TrainMy.DTO.UserDTO;

import java.util.List;

public interface TeacherDAO {
    TeacherDTO getTeacherWithCourseById(int teacherId);
    //TeacherDTO getTeacherByName(String name);
    //TeacherDTOOnly getTeacherByIdOnlyTeacher(int teacherId);
    //TeacherDTO getTeacherByNameOnlyTeacher(String name);
    void deleteById(int id);
    void insertTeacher(TeacherDTO user);
    void update(TeacherDTO teacherDTO);
}
