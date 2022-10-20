package com.example.TrainMy.controller;

import com.example.TrainMy.DTO.CourseDTO;
import com.example.TrainMy.DTO.CourseDTOInsert;
import com.example.TrainMy.DTO.StudentGoToCourseDTOInsert;
import com.example.TrainMy.DTO.UserDTO;
import com.example.TrainMy.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping ("/insertCourse")
     public void  insertIntoCourse(@RequestBody CourseDTOInsert courseDTOInsert){
        courseService.insertCourse(courseDTOInsert);
    }

    @PostMapping("/insertStudentToCourse")
    public void insert(@RequestBody StudentGoToCourseDTOInsert studentGoToCourseDTOInsert){
        courseService.insertStudentToCourse(studentGoToCourseDTOInsert);
    }

    @PutMapping("/updateCourse")
    public void  update(@RequestBody CourseDTOInsert courseDTOInsert){
        courseService.updateCourse(courseDTOInsert);
    }
}
