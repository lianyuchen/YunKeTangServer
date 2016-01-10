package com.demo.cloudserver.dao.impl;

import java.sql.ResultSet;

import com.demo.cloudserver.dao.CourseDAO;
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
}
