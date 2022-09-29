package com.example.TrainMy.rowMapper;

import com.example.TrainMy.DTO.UserDTO;

import org.apache.catalina.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RowMapperUser implements RowMapper<UserDTO> {
    @Override
    public UserDTO mapRow(ResultSet rs, int rowNum) throws SQLException {

            UserDTO user = new UserDTO();
            user.setStudentId(rs.getInt("student_id"));
            user.setAge(rs.getInt("age"));
            user.setFirstNameStudent(rs.getString("first_name"));
            user.setLastNameStudent(rs.getString("last_name"));

        return user;
    }



//    public UserDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
//        UserDTO user = new UserDTO();
//        while (rs.next()) {
//            if(user.getStudentId()==0){
//                user.setStudentId(rs.getInt("student_id"));
//            }
//            user.setAge(rs.getInt("age"));
//            user.setFirstNameStudent(rs.getString("first_name"));
//            user.setLastNameStudent(rs.getString("last_name"));
//        }
//        return user;
}