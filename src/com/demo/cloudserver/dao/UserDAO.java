package com.demo.cloudserver.dao;

import com.demo.cloudserver.entity.StudentInfo;

public interface UserDAO {

	public StudentInfo queryUserByNameAndPassword(String username, String password);

}
