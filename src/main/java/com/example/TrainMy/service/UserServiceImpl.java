package com.example.TrainMy.service;

import com.example.TrainMy.DAO.student.UserDAO;
import com.example.TrainMy.DTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    public UserDAO userDAO;
    @Autowired
    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public UserDTO getUserById(int studentId) {
        return userDAO.getUserById(studentId);
    }

    @Override
    public UserDTO getUserByName(String name) {
        return userDAO.getUserByName(name);
    }

    @Override
    public List<UserDTO> getAllUserDTO() {
        return userDAO.getAllUser();
    }


    @Override
    public void deleteById(int studentId) {
        userDAO.deleteById(studentId);

    }

    @Override
    public void insertUser(UserDTO user) {
        userDAO.insertUser(user);

    }

    @Override
    public void update(UserDTO userDTO) {
        userDAO.update(userDTO);
    }

}
