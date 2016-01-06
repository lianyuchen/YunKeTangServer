package com.demo.cloudserver.dao;

import com.demo.cloudserver.entity.StudentInfo;

public interface UserDAO {

	public StudentInfo queryUserByNameAndPassword(String username, String password);
	
	/**
	 * 插入用户信息
	 * @param username 用户名，不为空
	 * @param password 密码，不为空
	 * @param gender 性别，不为空（0为女，1为男）
	 * @param major  专业，可为空
	 * @param photoPath  头像，可为空
	 * @return
	 */
    public boolean insertUser(String username, String password, int gender, String major, String photoPath);

}
