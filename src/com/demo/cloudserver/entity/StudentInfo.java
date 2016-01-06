package com.demo.cloudserver.entity;

import java.io.Serializable;

public class StudentInfo implements Serializable{

	private int student_id;
	private String student_name;
	private String student_pwd;
	private int student_gender;
	private String student_major;
	private String student_photo;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_pwd() {
		return student_pwd;
	}
	public void setStudent_pwd(String student_pwd) {
		this.student_pwd = student_pwd;
	}
	public int getStudent_gender() {
		return student_gender;
	}
	public void setStudent_gender(int student_gender) {
		this.student_gender = student_gender;
	}
	public String getStudent_major() {
		return student_major;
	}
	public void setStudent_major(String student_major) {
		this.student_major = student_major;
	}
	public String getStudent_photo() {
		return student_photo;
	}
	public void setStudent_photo(String student_photo) {
		this.student_photo = student_photo;
	}
	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name="
				+ student_name + ", student_pwd=" + student_pwd
				+ ", student_gender=" + student_gender + ", student_major="
				+ student_major + ", student_photo=" + student_photo + "]";
	}
	
	
}
