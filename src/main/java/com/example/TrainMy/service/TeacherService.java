package com.example.TrainMy.service;

import com.example.TrainMy.DTO.TeacherDTO;
import com.example.TrainMy.DTO.TeacherDTOInsert;
import com.example.TrainMy.DTO.TeacherWithListStringCourseDTO;


import java.util.List;

public interface TeacherService {
    TeacherDTO getTeacherById(int teacherId);
    void deleteByIdTeacher(int teacherId);
    void insertTeacher(TeacherDTOInsert teacherDTOInsert);
    void updateTeacher(TeacherDTOInsert teacherDTOInsert);
     List<TeacherDTO> getTeacherAll();
     List<TeacherWithListStringCourseDTO> getTeacherAllList();


}

