package com.demo.cloudserver.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DBManager {

	private Connection conn = null;
	private PreparedStatement pstmt = null;

	private static String dbDriver = "";
	private static String dbUrl = "";
	private static String dbUsername = "";
	private static String dbPasword = "";
	
	private static Properties prop = new Properties();
	
	static{
		
		//加载属性文件
		try {
			prop.load(DBManager.class.getResourceAsStream("dbconfig.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//读取属性
		dbDriver = prop.getProperty("dbDriver");
		dbUrl = prop.getProperty("dbUrl");
		dbUsername = prop.getProperty("dbUsername");
		dbPasword = prop.getProperty("dbPasword");		
	}
	
	//加载数据库驱动
	public DBManager(){
		
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	//打开数据库连接
	private void openConnection(){
		
		try {
			this.conn = DriverManager.getConnection(dbUrl, dbUsername, dbPasword);
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	public ResultSet execQuery(String sql, Object... params){
		
		this.openConnection();
		
		try {
			this.pstmt = this.conn.prepareStatement(sql);
			
			for (int i = 0; i < params.length; i++) {
				this.pstmt.setObject(i+1, params[i]);
			}
					
			return this.pstmt.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		
	}
		
	public int execUpdate(String sql, Object... params){
		
		this.openConnection();
		
		try {
			this.pstmt = this.conn.prepareStatement(sql);
			
			for (int i = 0; i < params.length; i++) {
				this.pstmt.setObject(i+1, params[i]);
			}
					
			return this.pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}finally{
			this.closeConnection();
		}
		
	}
	
	public void closeConnection(){
		
		if(this.pstmt!=null){
			try {
				this.pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		if(this.conn!=null){
			try {
				this.conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {

		DBManager dbManager = new DBManager();
		
		//String sql = "insert into user values(null, ?, ?, ?)";
		//String sql = "update user set score=? where username = ?";
		//String sql = "delete from user where username=?";
		
		//dbManager3.execUpdate(sql, "user13");
		
		String sql ="select * from student where student_name = ?";
		
		ResultSet rs = dbManager.execQuery(sql,"连雨辰");
		
		try {
			while(rs.next()){
				System.out.println(rs.getInt(1) +  "-" + rs.getString(2) + "-" + rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			dbManager.closeConnection();
		}
		
	}

}
