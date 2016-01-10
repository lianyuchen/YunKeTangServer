package com.demo.cloudserver.service.impl;

import com.demo.cloudserver.dao.CourseDAO;
import com.demo.cloudserver.dao.impl.CourseDAOImpl;
import com.demo.cloudserver.service.CourseService;

public class CourseServiceImpl implements CourseService{

    private CourseDAO CourseDAO = new CourseDAOImpl();
    
    @Override
    public boolean add(String coursename, String coursetime, String courselocation){
        
        boolean isSuccess = CourseDAO.insertCourse(coursename, coursetime, courselocation);
        
        return isSuccess;
    }

}
