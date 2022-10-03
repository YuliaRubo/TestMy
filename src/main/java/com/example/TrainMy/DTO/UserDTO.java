package com.example.TrainMy.DTO;

import java.util.List;

public class UserDTO {

    private int studentId;
    private String firstNameStudent;
    private String lastNameStudent;
    private int age;
    private List<String>courseNames;

    public UserDTO() {
    }

    public UserDTO(int studentId, String firstNameStudent, String lastNameStudent, int age, List<String> courseNames) {
        this.studentId = studentId;
        this.firstNameStudent = firstNameStudent;
        this.lastNameStudent = lastNameStudent;
        this.age = age;
        this.courseNames = courseNames;
    }

    public List<String> getCourseNames() {
        return courseNames;
    }

    public void setCourseNames(List<String> courseNames) {
        this.courseNames = courseNames;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstNameStudent() {
        return firstNameStudent;
    }

    public void setFirstNameStudent(String firstNameStudent) {
        this.firstNameStudent = firstNameStudent;
    }

    public String getLastNameStudent() {
        return lastNameStudent;
    }

    public void setLastNameStudent(String lastNameStudent) {
        this.lastNameStudent = lastNameStudent;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "studentId=" + studentId +
                ", firstNameStudent='" + firstNameStudent + '\'' +
                ", lastNameStudent='" + lastNameStudent + '\'' +
                ", age=" + age +
                ", courseNames=" + courseNames +
                '}';
    }
}
