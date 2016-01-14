package com.demo.cloudserver.dao;

import java.util.List;

import com.demo.cloudserver.entity.CourseInfo;

public interface CourseDAO {

    public boolean insertCourse(String coursename, String coursetime, String courselocation);
    
    public boolean deleteCourse(String coursename);
    
    public List<CourseInfo> queryCourseByCourseTime(String coursetime);
    
}
