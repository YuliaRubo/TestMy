package com.example.TrainMy.DAO.teacher;

import com.example.TrainMy.DTO.TeacherDTO;
import com.example.TrainMy.DTO.TeacherDTOInsert;
import com.example.TrainMy.DTO.TeacherWithListStringCourseDTO;

import java.util.List;

public interface TeacherDAO {
    TeacherDTO getTeacherById(int teacherId);
    void deleteById(int id);
    void insertTeacher(TeacherDTOInsert teacherDTOInsert);
    void updateTeacher(TeacherDTOInsert teacherDTOInsert);
    List<TeacherDTO> getTeacherAll();
    public List<TeacherWithListStringCourseDTO> getTeacherAllList();
}
