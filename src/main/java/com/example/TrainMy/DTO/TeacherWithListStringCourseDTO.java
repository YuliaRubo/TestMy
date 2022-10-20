package com.example.TrainMy.DTO;

import java.util.List;

public class TeacherWithListStringCourseDTO {
    private int teacherId;
    private String firstNameTeacher;
    private String lastNameTeacher;
    List<String> courseList;

    public TeacherWithListStringCourseDTO() {
    }

    public TeacherWithListStringCourseDTO(int teacherId, String firstNameTeacher, String lastNameTeacher, List<String> courseList) {
        this.teacherId = teacherId;
        this.firstNameTeacher = firstNameTeacher;
        this.lastNameTeacher = lastNameTeacher;
        this.courseList = courseList;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getFirstNameTeacher() {
        return firstNameTeacher;
    }

    public void setFirstNameTeacher(String firstNameTeacher) {
        this.firstNameTeacher = firstNameTeacher;
    }

    public String getLastNameTeacher() {
        return lastNameTeacher;
    }

    public void setLastNameTeacher(String lastNameTeacher) {
        this.lastNameTeacher = lastNameTeacher;
    }

    public List<String> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<String> courseList) {
        this.courseList = courseList;
    }
}
