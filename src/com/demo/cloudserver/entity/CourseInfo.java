package com.demo.cloudserver.entity;

import java.io.Serializable;

public class CourseInfo implements Serializable {

	private int classinfo_id;
	private String classinfo_name;
	private String classinfo_time;
	private String classindo_location;
	public int getClassinfo_id() {
		return classinfo_id;
	}
	public void setClassinfo_id(int classinfo_id) {
		this.classinfo_id = classinfo_id;
	}
	public String getClassinfo_name() {
		return classinfo_name;
	}
	public void setClassinfo_name(String classinfo_name) {
		this.classinfo_name = classinfo_name;
	}
	public String getClassinfo_time() {
		return classinfo_time;
	}
	public void setClassinfo_time(String classinfo_time) {
		this.classinfo_time = classinfo_time;
	}
	public String getClassindo_location() {
		return classindo_location;
	}
	public void setClassindo_location(String classindo_location) {
		this.classindo_location = classindo_location;
	}
	@Override
	public String toString() {
		return "ClassInfo [classinfo_id=" + classinfo_id + ", classinfo_name="
				+ classinfo_name + ", classinfo_time=" + classinfo_time
				+ ", classindo_location=" + classindo_location + "]";
	}
	
}
