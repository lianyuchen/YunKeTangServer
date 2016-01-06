package com.demo.cloudserver.entity;

import java.io.Serializable;

public class EnrollmentInfo implements Serializable {

	private int enrollment_id;
	private int student_id;
	private int classinfo_id;
	public int getEnrollment_id() {
		return enrollment_id;
	}
	public void setEnrollment_id(int enrollment_id) {
		this.enrollment_id = enrollment_id;
	}
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}
	public int getClassinfo_id() {
		return classinfo_id;
	}
	public void setClassinfo_id(int classinfo_id) {
		this.classinfo_id = classinfo_id;
	}
	@Override
	public String toString() {
		return "Enrollment [enrollment_id=" + enrollment_id + ", student_id="
				+ student_id + ", classinfo_id=" + classinfo_id + "]";
	}
	
}
