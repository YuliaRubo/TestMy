package com.example.TrainMy.service;

import com.example.TrainMy.DAO.course.CourseDAO;
import com.example.TrainMy.DAO.student.UserDAO;
import com.example.TrainMy.DTO.CourseDTO;
import com.example.TrainMy.DTO.CourseDTOInsert;
import com.example.TrainMy.DTO.StudentGoToCourseDTOInsert;
import com.example.TrainMy.DTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    private CourseDAO courseDAO;
    private UserDAO userDAO;
    @Autowired
    public CourseServiceImpl(CourseDAO courseDAO, UserDAO userDAO) {
        this.courseDAO = courseDAO;
        this.userDAO = userDAO;
    }

    @Override
    public List<CourseDTO> getCourseByTeacherID(int teacherId) {
        return null;
    }

    @Override
    public CourseDTO getCourseById(int courseId) {
       CourseDTO courseDTO = courseDAO.getCourseById(courseId);
       List<UserDTO> listUser = userDAO.getUsersByCourseId(courseId);
       List<String> userDTOList= new ArrayList<>();
//       userDTOList.add("Lili");
//       userDTOList.add("Rita");
        for(UserDTO d: listUser){
            userDTOList.add(d.getLastNameStudent() + " " + d.getFirstNameStudent());
        }
     courseDTO.setUserNames(userDTOList);
        return courseDTO;
    }

    @Override
    public void deleteStudentFromCourseByCourseId(int courseId) {
        userDAO.deleteStudentFromCourseByCourseId(courseId);
    }

    @Override
    public void insertCourse(CourseDTOInsert courseDTOInsert) {
        courseDAO.insertCourse(courseDTOInsert);
    }

    @Override
    public void insertStudentToCourse(StudentGoToCourseDTOInsert studentGoToCourseDTOInsert) {
        courseDAO.insertStudentToCourse(studentGoToCourseDTOInsert);
    }

    @Override
    public void updateCourse(CourseDTOInsert courseDTO) {
        courseDAO.updateCourse(courseDTO);
    }


}
