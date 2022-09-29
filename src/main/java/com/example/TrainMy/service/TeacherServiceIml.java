package com.example.TrainMy.service;

import com.example.TrainMy.DAO.teacher.TeacherDAO;
import com.example.TrainMy.DTO.TeacherDTO;
import com.example.TrainMy.DTO.TeacherDTOOnly;
import com.example.TrainMy.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherServiceIml implements TeacherService{

    public  TeacherDAO teacherDAO;
    @Autowired
    public TeacherServiceIml(TeacherDAO teacherDAO) {
        this.teacherDAO = teacherDAO;
    }

    @Override
    public TeacherDTO getTeacherById(int teacherId) {
        return teacherDAO.getTeacherById(teacherId);
    }

    @Override
    public TeacherDTOOnly getTeacherByIdOnlyTeacher(int teacherId) {
        return teacherDAO.getTeacherByIdOnlyTeacher(teacherId);
    }

    @Override
    public TeacherDTO getTeacherByName(String name) {
        return teacherDAO.getTeacherByName(name);
    }



    @Override
    public void deleteById(int id) {
        teacherDAO.deleteById(id);

    }

    @Override
    public void insertTeacher(TeacherDTO user) {

    }

    @Override
    public void update(TeacherDTO teacherDTO) {

    }
}
