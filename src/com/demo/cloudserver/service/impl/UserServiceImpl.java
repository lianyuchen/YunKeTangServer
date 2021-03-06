package com.demo.cloudserver.service.impl;

import com.demo.cloudserver.dao.UserDAO;
import com.demo.cloudserver.dao.impl.UserDAOImpl;
import com.demo.cloudserver.entity.StudentInfo;
import com.demo.cloudserver.service.UserService;

public class UserServiceImpl implements UserService {

    private UserDAO userDAO = new UserDAOImpl();

    @Override
    public StudentInfo login(String username, String password) {
        StudentInfo user = userDAO.queryUserByNameAndPassword(username,
                password);

        if (null != user) {
            return user;
        } else {
            return null;
        }
    }

    @Override
    public boolean register(String username, String password, int gender,
            String major, String photoPath) {
        
        boolean isSuccess = userDAO.insertUser(username, password, gender,
                major, photoPath);

        return isSuccess;
    }

}
