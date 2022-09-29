package com.example.TrainMy.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Student {

    private int studentId;
    private String firstNameStudent;
    private String lastNameStudent;
    private int age;

}
