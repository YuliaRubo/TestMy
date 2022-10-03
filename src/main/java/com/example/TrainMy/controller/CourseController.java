package com.example.TrainMy.controller;

import com.example.TrainMy.DTO.CourseDTO;
import com.example.TrainMy.DTO.UserDTO;
import com.example.TrainMy.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    public CourseService courseService;
    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/getCourseById/{id}")
    CourseDTO getCourseById(@PathVariable("id")  Integer courseId){
       return courseService.getCourseById(courseId);
    }
    @GetMapping("/deleteStudentFromCourse/{id}")
    public void deleteStudentFromCourseByCourseId(@PathVariable("id") int courseId){
        courseService.deleteStudentFromCourseByCourseId(courseId);
    }




}
