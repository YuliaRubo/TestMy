package com.example.TrainMy.DTO;

public class UserDTO {

    private int studentId;
    private String firstNameStudent;
    private String lastNameStudent;
    private int age;

    public UserDTO() {
    }

    public UserDTO(int studentId, String firstNameStudent, String lastNameStudent, int age) {
        this.studentId = studentId;
        this.firstNameStudent = firstNameStudent;
        this.lastNameStudent = lastNameStudent;
        this.age = age;
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
                 studentId +
                firstNameStudent + '\'' +
                lastNameStudent + '\'' +
                 + age +
                '}';
    }
}
