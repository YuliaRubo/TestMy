package com.example.TrainMy.entity;

import javax.persistence.*;

@Entity
@Table(name="STUDENT")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id", nullable = false)
    private Integer studentId;


    @Column(name="first_name")
    private String firstNameStudent;

    @Column(name="last_name")
    private String lastNameStudent;
    @Column(name="age")
    private int age;

    public User() {
    }

    public User(Integer studentId, String firstNameStudent, String lastNameStudent, int age) {
        this.studentId = studentId;
        this.firstNameStudent = firstNameStudent;
        this.lastNameStudent = lastNameStudent;
        this.age = age;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
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
        return "User{" +
                "studentId=" + studentId +
                ", firstNameStudent='" + firstNameStudent + '\'' +
                ", lastNameStudent='" + lastNameStudent + '\'' +
                ", age=" + age +
                '}';
    }
}
