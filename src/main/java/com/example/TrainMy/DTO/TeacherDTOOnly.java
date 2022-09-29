package com.example.TrainMy.DTO;

public class TeacherDTOOnly {

    private int teacherId;
    private String firstNameTeacher;
    private String lastNameTeacher;

    public TeacherDTOOnly() {
    }

    public TeacherDTOOnly(int teacherId, String firstNameTeacher, String lastNameTeacher) {
        this.teacherId = teacherId;
        this.firstNameTeacher = firstNameTeacher;
        this.lastNameTeacher = lastNameTeacher;
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

    @Override
    public String toString() {
        return "TeacherDTOOnly{" +
                "teacherId=" + teacherId +
                ", firstNameTeacher='" + firstNameTeacher + '\'' +
                ", lastNameTeacher='" + lastNameTeacher + '\'' +
                '}';
    }
}
