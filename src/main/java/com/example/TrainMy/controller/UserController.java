package com.example.TrainMy.controller;

import com.example.TrainMy.DTO.UserDTO;
import com.example.TrainMy.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class UserController {

    public UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getById/{id}")
    UserDTO getById(@PathVariable("id") Integer studentId){
        return userService.getUserById(studentId);
    }

    @GetMapping("/getByName/{name}")
    UserDTO getByName(@PathVariable ("name") String firstNameStudent){
        return userService.getUserByName(firstNameStudent);
    }

    @GetMapping("/getAll")
    List<UserDTO> getAllUserDTO(){
        return userService.getAllUserDTO();
    }

    @GetMapping ("/deleteUser/{id}")
        public void deleteById(@PathVariable("id") Integer studentId) {
        userService.deleteById(studentId);
    }

    @PostMapping ("/insert")
    public void updateAndSave(@RequestBody UserDTO user){
        userService.insertUser(user);
    }

    @PostMapping("/update/{id}")
    public void update(@PathParam("id") int id, UserDTO user){
        userService.update(user);
    }
}
