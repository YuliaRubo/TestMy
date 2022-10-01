package com.example.TrainMy.DAO.course;

import com.example.TrainMy.DTO.CourseDTO;
import com.example.TrainMy.DTO.CourseWithTeacherDTO;
import com.example.TrainMy.DTO.TeacherDTO;

public interface CourseDAO {
    CourseDTO getCourseById(int courseId);
    CourseWithTeacherDTO getCourseByIdWithTeacher(int courseId);
    void delete(int teacherId);
}
