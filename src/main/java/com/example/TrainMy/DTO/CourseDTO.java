package com.example.TrainMy.DTO;

public class CourseDTO {

    private int CourseID;
    private String nameCourse;


    public CourseDTO() {
    }

    public CourseDTO(int courseID, String nameCourse) {
        CourseID = courseID;
        this.nameCourse = nameCourse;
    }
    public int getCourseID() {
        return CourseID;
    }

    public void setCourseID(int courseID) {
        CourseID = courseID;
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
                "CourseID=" + CourseID +
                ", nameCourse='" + nameCourse + '\'' +
                '}';
    }
}
