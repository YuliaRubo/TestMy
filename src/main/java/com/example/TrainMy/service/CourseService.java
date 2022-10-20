package com.example.TrainMy.service;

import com.example.TrainMy.DTO.CourseDTO;
import com.example.TrainMy.DTO.CourseDTOInsert;
import com.example.TrainMy.DTO.StudentGoToCourseDTOInsert;
import com.example.TrainMy.DTO.UserDTO;

import java.util.List;

public interface CourseService {
    List<CourseDTO> getCourseByTeacherID(int teacherId);
    CourseDTO getCourseById(int courseId);
    void deleteStudentFromCourseByCourseId(int courseId);
    void insertCourse(CourseDTOInsert courseDTOInsert);
    void insertStudentToCourse(StudentGoToCourseDTOInsert studentGoToCourseDTOInsert);
    void updateCourse(CourseDTOInsert courseDTO);
   // void delete(int teacherId);
}
