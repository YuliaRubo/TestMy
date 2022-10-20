package com.example.TrainMy.DTO;

public class StudentGoToCourseDTOInsert {

    public int courseId;
    public  int studentId;

    public StudentGoToCourseDTOInsert() {
    }

    public StudentGoToCourseDTOInsert(int courseId, int studentId) {
        this.courseId = courseId;
        this.studentId = studentId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "StudentGoToCourseDTOInsert{" +
                "courseId=" + courseId +
                ", studentId=" + studentId +
                '}';
    }
}
