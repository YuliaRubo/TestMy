package com.example.TrainMy.DTO;

public class CourseDTO {

    private int courseId;
    private String nameCourse;


    public CourseDTO() {
    }

    public CourseDTO(int courseId, String nameCourse) {
        this.courseId = courseId;
        this.nameCourse = nameCourse;
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

    @Override
    public String toString() {
        return "CourseDTO{" +
                "courseId=" + courseId +
                ", nameCourse='" + nameCourse + '\'' +
                '}';
    }
}
