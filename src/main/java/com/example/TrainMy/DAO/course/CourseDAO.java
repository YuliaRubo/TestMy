package com.example.TrainMy.DAO.course;

import com.example.TrainMy.DTO.*;

import java.util.List;

public interface CourseDAO {
    CourseDTO getCourseById(int courseId);
    //CourseWithTeacherDTO getCourseByIdWithTeacher(int courseId);
    void delete(int teacherId);
    List<CourseDTO> getCoursesByUserId(int id);
    List<CourseDTO> getCourseByTeacherID(int teacherId);
    void  insertCourse(CourseDTOInsert courseDTO);
    void insertStudentToCourse(StudentGoToCourseDTOInsert studentGoToCourseDTOInsert);
    void updateCourse(CourseDTOInsert courseDTO);
}
