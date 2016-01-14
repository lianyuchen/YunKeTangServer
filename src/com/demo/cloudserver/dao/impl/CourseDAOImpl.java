package com.demo.cloudserver.dao.impl;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.cloudserver.dao.CourseDAO;
import com.demo.cloudserver.entity.CourseInfo;
import com.demo.cloudserver.util.DBManager;


public class CourseDAOImpl implements CourseDAO{

    private DBManager dbManager = new DBManager();
    
    @Override
    public boolean insertCourse(String coursename, String coursetime, String courselocation){
        
        String sql = "";
        boolean result = false;

        sql = "insert into classinfo(classinfo_id,classinfo_name,classinfo_time,classinfo_location) values (null, ?, ?, ?)";
        result = dbManager.execUpdate(sql, coursename,coursetime,courselocation)>0;
        
        return result;
    }

    @Override
    public boolean deleteCourse(String coursename) {
       
        String sql = "delete from classinfo where classinfo_name=?";
       
        return dbManager.execUpdate(sql, coursename) > 0;
    }

    @Override
    public  List<CourseInfo> queryCourseByCourseTime(String coursetime) {
        // TODO Auto-generated method stub
        
        String sql = "select * from classinfo where classinfo_time > ?";
        
        ResultSet rs =  dbManager.execQuery(sql, coursetime);
        
        List<CourseInfo> CourseList = new ArrayList<CourseInfo>();
        
        try {
            while(rs.next()){
                
                CourseInfo course = new CourseInfo();
                course.setClassindo_location(rs.getString(4));
                course.setClassinfo_name(rs.getString(2));
                course.setClassinfo_time(rs.getString(3));
                course.setClassinfo_id(rs.getInt(1));
                
                CourseList.add(course);
                
   }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return CourseList;
    }
}
