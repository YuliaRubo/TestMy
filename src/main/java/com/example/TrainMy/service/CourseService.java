package com.example.TrainMy.service;

import com.example.TrainMy.DTO.CourseDTO;

public interface CourseService {
    CourseDTO getCourseById(int courseId);
    void deleteStudentFromCourseByCourseId(int courseId);
   // void delete(int teacherId);
}
