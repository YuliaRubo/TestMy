package com.example.TrainMy.DAO.student;

import com.example.TrainMy.DTO.UserDTO;
import com.example.TrainMy.rowMapper.RowMapperUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class UserDAOImpl implements UserDAO{

    public NamedParameterJdbcTemplate namedParameterJdbcTemplate;
    @Autowired
    public UserDAOImpl(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }
    public final String GET_ID = "SELECT *  FROM STUDENT WHERE student_id=:student_id";
    public final String GET_NAME = "SELECT *  FROM STUDENT WHERE first_name=:first_name";
    public final String GET_ALL = "select * from student";
    public final String INSERT_TO_TABLE = "insert into STUDENT (age, first_name, last_name) values (:age, :first_name, :last_name)";
    public final String DELETE_BY_ID = "DELETE  FROM STUDENT WHERE student_id=:student_id";
    public final String UPDATE_BY_NANE = "UPDATE STUDENT SET first_name = :first_name where student_id=:student_id";


    @Override
    public UserDTO getUserById(int studentId) {
        Map<String, Object> param = new HashMap<>();
        param.put("student_id", studentId);
        return namedParameterJdbcTemplate.queryForObject(GET_ID, param,new RowMapperUser());
    }

    @Override
    public UserDTO getUserByName(String name) {
        Map<String, Object> param = new HashMap<>();
        param.put("first_name", name);
        return namedParameterJdbcTemplate.queryForObject(GET_NAME, param, new RowMapperUser());
    }

    @Override
    public List<UserDTO> getAllUser() {
        List<UserDTO> userDTOList =namedParameterJdbcTemplate.query(GET_ALL, new RowMapperUser());
        return userDTOList;
    }

    @Override
    public void deleteById(int studentId) {
        int status = namedParameterJdbcTemplate.update(DELETE_BY_ID, new MapSqlParameterSource("student_id",  studentId));
        if(status != 0){
            System.out.println("User data deleted for ID " + studentId);
        }else{
            System.out.println("No User found with ID " + studentId);
        }
    }

    @Override
    public void insertUser(UserDTO user) {
        SqlParameterSource sqlParameterSource = new MapSqlParameterSource()
                .addValue("first_name", user.getFirstNameStudent())
                .addValue("last_name", user.getLastNameStudent())
                .addValue("age", user.getAge());
        namedParameterJdbcTemplate.update(INSERT_TO_TABLE, sqlParameterSource);
    }

    @Override
    public void update(UserDTO userDTO) {
        SqlParameterSource sqlParameterSource = new MapSqlParameterSource()
                .addValue("student_id", userDTO.getStudentId())
                .addValue("first_name", userDTO.getFirstNameStudent())
                .addValue("last_name", userDTO.getLastNameStudent())
                .addValue("age", userDTO.getAge());
        int status = namedParameterJdbcTemplate.update(UPDATE_BY_NANE, sqlParameterSource);
        if(status != 0){
            System.out.println("User data updated for ID " + userDTO.getStudentId());
        }else{
            System.out.println("No User found with ID " + userDTO.getStudentId());
        }
    }

    }


//    @Override
//    public void updateUser(UserDTO user) {
//        namedParameterJdbcTemplate.update(INSERT_TO_TABLE , new MapSqlParameterSource()
//                .addValue("student_id", user.getStudentId())
//                .addValue("first_name", user.getFirstNameStudent())
//                .addValue("last_name", user.getLastNameStudent())
//                .addValue("age", user.getAge()));
//
//    }



