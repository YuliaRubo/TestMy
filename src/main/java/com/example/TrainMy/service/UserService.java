package com.example.TrainMy.service;

import com.example.TrainMy.DTO.UserDTO;
import org.apache.catalina.User;

import java.util.List;

public interface UserService {

    UserDTO getUserById(int studentId);
    UserDTO getUserByName(String name);
    List<UserDTO> getAllUserDTO();
    void deleteById(int studentId);
    void insertUser(UserDTO user);
    void update(UserDTO userDTO);
}
