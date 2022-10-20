package com.example.TrainMy.service;

import com.example.TrainMy.DAO.course.CourseDAO;
import com.example.TrainMy.DAO.student.UserDAO;
import com.example.TrainMy.DAO.teacher.TeacherDAO;
import com.example.TrainMy.DTO.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TeacherServiceIml implements TeacherService{

   private  TeacherDAO teacherDAO;
   private  CourseDAO courseDAO;
   private UserDAO userDAO;

    @Autowired
    public TeacherServiceIml(TeacherDAO teacherDAO, CourseDAO courseDAO, UserDAO userDAO) {
        this.teacherDAO = teacherDAO;
        this.courseDAO = courseDAO;
        this.userDAO = userDAO;
    }



    @Override
    public TeacherDTO getTeacherById(int teacherId) {
       TeacherDTO teacherDTO = teacherDAO.getTeacherById(teacherId);
       List<CourseDTO> courseDTOList=courseDAO.getCourseByTeacherID(teacherId);

       for(CourseDTO c: courseDTOList){
           List<UserDTO>userDTOList = userDAO.getUsersByCourseId(c.getCourseId());
           List<String>listStr = new ArrayList<>();
           for(UserDTO u: userDTOList){
               listStr.add(u.getLastNameStudent()+" " +u.getFirstNameStudent());
           }
           c.setUserNames(listStr);
       }
       teacherDTO.setCourseList(courseDTOList);
       return teacherDTO;
    }


    @Override
    public void deleteByIdTeacher(int teacherId) {
        courseDAO.delete(teacherId);
        teacherDAO.deleteById(teacherId);
    }

    @Override
    public void insertTeacher(TeacherDTOInsert teacherDTOInsert) {
        teacherDAO.insertTeacher(teacherDTOInsert);

    }

    @Override
    public void updateTeacher(TeacherDTOInsert teacherDTOInsert) {
        teacherDAO.updateTeacher(teacherDTOInsert);
    }

    @Override
    public List<TeacherDTO> getTeacherAll() {
        List<TeacherDTO>newList = teacherDAO.getTeacherAll();
        for(TeacherDTO t: newList){
            int teacherId = t.getTeacherId();
            List<CourseDTO>courseDTOLis = courseDAO.getCourseByTeacherID(teacherId);
            List<String>course = new ArrayList<>();
            for(CourseDTO d: courseDTOLis){
               course.add(d.getNameCourse());
            }
            t.setCourseList(courseDTOLis);
            }
        return newList;
    }

    @Override
    public List<TeacherWithListStringCourseDTO> getTeacherAllList() {
        List<TeacherWithListStringCourseDTO> listTeach = teacherDAO.getTeacherAllList();
        for(TeacherWithListStringCourseDTO t: listTeach){
            int teacherId = t.getTeacherId();
            List<CourseDTO>courseDTOList = courseDAO.getCourseByTeacherID(teacherId);
            List<String>courseNameList = new ArrayList<>();
            for(CourseDTO c:courseDTOList){
                String courseName = c.getNameCourse();
                courseNameList.add(courseName);
            }
            t.setCourseList(courseNameList);
        }
        return listTeach;
    }


}
