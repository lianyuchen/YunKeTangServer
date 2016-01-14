package com.demo.cloudserver.service;

import java.util.List;

import com.demo.cloudserver.entity.CourseInfo;

public interface CourseService {

    public boolean add(String coursename, String coursetime, String courselocation);
    
    public boolean delete(String coursename);
    
    public List<CourseInfo> select(String coursetime);
    
    
}
