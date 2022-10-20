package com.example.TrainMy.DTO;

public class CourseDTOInsert {
    private int courseId;
    private String nameCourse;
    private int teacherId;

    public CourseDTOInsert() {
    }

    public CourseDTOInsert(int courseId, String nameCourse, int teacherId) {
        this.courseId = courseId;
        this.nameCourse = nameCourse;
        this.teacherId = teacherId;
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

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
