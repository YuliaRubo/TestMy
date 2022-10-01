package com.example.TrainMy.service;

import com.example.TrainMy.DTO.TeacherDTO;
import com.example.TrainMy.DTO.TeacherDTOOnly;

import java.util.List;

public interface TeacherService {
    TeacherDTO getTeacherById(int teacherId);
    //TeacherDTOOnly getTeacherByIdOnlyTeacher(int teacherId);
    //TeacherDTO getTeacherByName(String name);
    void deleteByIdTeacher(int teacherId);
    void insertTeacher(TeacherDTO user);
    void update(TeacherDTO teacherDTO);
}

