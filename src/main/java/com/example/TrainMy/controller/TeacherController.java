package com.example.TrainMy.controller;

import com.example.TrainMy.DTO.TeacherDTO;

import com.example.TrainMy.DTO.TeacherDTOInsert;
import com.example.TrainMy.DTO.TeacherWithListStringCourseDTO;
import com.example.TrainMy.service.TeacherService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TeacherController {

    public TeacherService teacherService;
    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/getTeacherByIdWithCourse/{id}")
    TeacherDTO getByIdWC(@PathVariable("id") int teacherId){
        return teacherService.getTeacherById(teacherId);
    }
    //одинаковый результат
    @GetMapping("/getTeacherByIdWithCourseId/{id}")
    TeacherDTO getByIdWCid(@PathVariable("id") Integer teacherId){
        return teacherService.getTeacherById(teacherId);
    }

    @GetMapping("/deleteTeacher/{id}")
    void deleteById(@PathVariable("id") int teacherId){
        teacherService.deleteByIdTeacher(teacherId);
    }


    @PostMapping("/insertTeacher")
    void  insertTeacher(@RequestBody TeacherDTOInsert teacherDTOInsert){
        teacherService.insertTeacher(teacherDTOInsert);
    }

    @PutMapping("/updateTeacher")
    void update(@RequestBody TeacherDTOInsert teacherDTOInsert){
        teacherService.updateTeacher(teacherDTOInsert);
    }

    @GetMapping("/getAllTeachers")
    List<TeacherDTO> getAllTeachers(){
        return teacherService.getTeacherAll();
    }

    @GetMapping("/getAllTeachersWithList")
    List<TeacherWithListStringCourseDTO>getAll(){
        return teacherService.getTeacherAllList();
    }
}
