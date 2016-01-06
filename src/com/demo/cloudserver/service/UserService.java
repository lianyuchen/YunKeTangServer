package com.demo.cloudserver.service;

import com.demo.cloudserver.entity.StudentInfo;

public interface UserService {

	public StudentInfo login(String username, String password);
	
	//public boolean register(String username, String password, int gender);
	
	public boolean register(String username, String password, int gender, String major, String photoPath);
}
