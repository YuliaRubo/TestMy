package com.example.TrainMy.DAO;

public class TeacherDTO {
    
    private int teacherId;
    private String firstNameTeacher;
    private String lastNameTeacher;


    public TeacherDTO() {
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

    @Override
    public String toString() {
        return "TeacherDTO{" +
                "teacherId=" + teacherId +
                ", firstNameTeacher='" + firstNameTeacher + '\'' +
                ", lastNameTeacher='" + lastNameTeacher + '\'' +
                '}';
    }
}
