package com.demo.cloudserver.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.cloudserver.dao.UserDAO;
import com.demo.cloudserver.entity.StudentInfo;
import com.demo.cloudserver.util.DBManager;

public class UserDAOImpl implements UserDAO {

	private DBManager dbManager = new DBManager();

	@Override
	public StudentInfo queryUserByNameAndPassword(String username,
			String password) {
		String sql = "select * from student where student_name = ? and student_pwd = ?";
		ResultSet rs = dbManager.execQuery(sql, username, password);

		try {

			if (rs.next()) {

				// 创建实体bean
				StudentInfo studentInfo = new StudentInfo();

				// 填充实体bean
				studentInfo.setStudent_id(rs.getInt(1));
				studentInfo.setStudent_name(rs.getString(2));
				studentInfo.setStudent_pwd(rs.getString(3));
				studentInfo.setStudent_gender(rs.getInt(4));
				studentInfo.setStudent_major(rs.getString(5));
				studentInfo.setStudent_photo(rs.getString(6));
				
//				user.setUser_id(rs.getInt(1));
//				user.setUser_name(rs.getString(2));
//				user.setUser_password(rs.getString(3));
//				user.setUser_score(rs.getInt(4));

				return studentInfo;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

}
