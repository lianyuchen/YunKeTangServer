package com.demo.cloudserver.service;

import com.demo.cloudserver.entity.StudentInfo;

public interface UserService {

	public StudentInfo login(String username, String password);
}
