package com.example.TrainMy.DAO;

import com.example.TrainMy.DTO.UserDTO;
import org.apache.catalina.User;

import java.util.List;

public interface UserDAO {
    UserDTO getUserById(int studentId);
    UserDTO getUserByName(String name);
    List<UserDTO> getAllUser();
    void deleteById(int id);
    void insertUser(UserDTO user);
    void update(UserDTO userDTO);
}
