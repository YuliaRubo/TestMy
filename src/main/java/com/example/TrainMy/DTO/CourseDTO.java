package com.example.TrainMy.DTO;

import java.util.List;

public class CourseDTO {

    private int courseId;
    private String nameCourse;
    List<String> userNames;


    public CourseDTO() {
    }

    public CourseDTO(int courseId, String nameCourse, List<String> userNames) {
        this.courseId = courseId;
        this.nameCourse = nameCourse;
        this.userNames = userNames;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public List<String> getUserNames() {
        return userNames;
    }

    public void setUserNames(List<String> userNames) {
        this.userNames = userNames;
    }

    @Override
    public String toString() {
        return "CourseDTO{" +
                "courseId=" + courseId +
                ", nameCourse='" + nameCourse + '\'' +
                ", userNames=" + userNames +
                '}';
    }
}
