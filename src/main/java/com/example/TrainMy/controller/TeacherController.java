package com.example.TrainMy.controller;

import com.example.TrainMy.DTO.TeacherDTO;
import com.example.TrainMy.DTO.TeacherDTOOnly;
import com.example.TrainMy.DTO.UserDTO;
import com.example.TrainMy.service.TeacherService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class TeacherController {

    public TeacherService teacherService;
    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/getTeacherByIdWithCourse/{id}")
    TeacherDTO getByIdWC(@PathVariable("id") Integer teacherId){
        return teacherService.getTeacherById(teacherId);
    }

    @GetMapping("/deleteTeacher/{id}")
    void deleteById(@PathVariable("id") int teacherId){
        teacherService.deleteById(teacherId);
    }
}
