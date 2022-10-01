package com.example.TrainMy.service;

import com.example.TrainMy.DAO.course.CourseDAO;
import com.example.TrainMy.DAO.teacher.TeacherDAO;
import com.example.TrainMy.DTO.TeacherDTO;
import com.example.TrainMy.DTO.TeacherDTOOnly;
import com.example.TrainMy.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherServiceIml implements TeacherService{

   private  TeacherDAO teacherDAO;
   private  CourseDAO courseDAO;
    @Autowired
    public TeacherServiceIml(TeacherDAO teacherDAO, CourseDAO courseDAO) {
        this.teacherDAO = teacherDAO;
        this.courseDAO = courseDAO;
    }

    @Override
    public TeacherDTO getTeacherById(int teacherId) {
        return teacherDAO.getTeacherWithCourseById(teacherId);
    }

    @Override
    public void deleteByIdTeacher(int teacherId) {
        courseDAO.delete(teacherId);
        teacherDAO.deleteById(teacherId);
    }

    @Override
    public void insertTeacher(TeacherDTO user) {

    }

    @Override
    public void update(TeacherDTO teacherDTO) {

    }
}
