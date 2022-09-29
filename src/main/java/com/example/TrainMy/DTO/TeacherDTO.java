package com.example.TrainMy.DTO;

import com.example.TrainMy.entity.Course;

import java.util.ArrayList;
import java.util.List;

public class TeacherDTO {
    
    private int teacherId;
    private String firstNameTeacher;
    private String lastNameTeacher;
    List<CourseDTO> courseList;


    public TeacherDTO() {
        courseList=new ArrayList<>();
    }

    public TeacherDTO(int teacherId, String firstNameTeacher, String lastNameTeacher) {
        this.teacherId = teacherId;
        this.firstNameTeacher = firstNameTeacher;
        this.lastNameTeacher = lastNameTeacher;

    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getFirstNameTeacher() {
        return firstNameTeacher;
    }

    public String getLastNameTeacher() {
        return lastNameTeacher;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public void setFirstNameTeacher(String firstNameTeacher) {
        this.firstNameTeacher = firstNameTeacher;
    }

    public void setLastNameTeacher(String lastNameTeacher) {
        this.lastNameTeacher = lastNameTeacher;
    }

    public List<CourseDTO> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<CourseDTO> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "TeacherDTO{" +
                "teacherId=" + teacherId +
                ", firstNameTeacher='" + firstNameTeacher + '\'' +
                ", lastNameTeacher='" + lastNameTeacher + '\'' +
                ", courseList=" + courseList +
                '}';
    }
}
