package com.example.TrainMy.service;

import com.example.TrainMy.DAO.course.CourseDAO;
import com.example.TrainMy.DAO.student.UserDAO;
import com.example.TrainMy.DTO.CourseDTO;
import com.example.TrainMy.DTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private UserDAO userDAO;
    private CourseDAO courseDAO;

    @Autowired
    public UserServiceImpl(UserDAO userDAO, CourseDAO courseDAO) {
        this.userDAO = userDAO;
        this.courseDAO = courseDAO;
    }

    @Override
    public UserDTO getUserById(int studentId) {
       UserDTO userDTO = userDAO.getUserById(studentId);
       List<CourseDTO>courseDTOList = courseDAO.getCoursesByUserId(studentId);
       List<String>listN = new ArrayList<>();
       for(CourseDTO n: courseDTOList){
          listN.add(n.getNameCourse());
       }
       userDTO.setCourseNames(listN);
        return userDTO;

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
