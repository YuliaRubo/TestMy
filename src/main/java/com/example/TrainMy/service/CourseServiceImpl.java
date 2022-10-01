package com.example.TrainMy.service;

import com.example.TrainMy.DAO.course.CourseDAO;
import com.example.TrainMy.DTO.CourseDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService{

    public CourseDAO courseDAO;

    @Autowired
    public CourseServiceImpl(CourseDAO courseDAO) {
        this.courseDAO = courseDAO;
    }

    @Override
    public CourseDTO getCourseById(int courseId) {
        return courseDAO.getCourseById(courseId);
    }

//    @Override
//    public void delete(int teacherId) {
//        courseDAO.delete(teacherId);

    //}
}
