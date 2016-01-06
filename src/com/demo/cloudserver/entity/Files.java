package com.demo.cloudserver.entity;

import java.io.Serializable;

public class Files implements Serializable {

	private int file_id;
	private int classinfo_id;
	private String file_name;
	private String file_path;
	private String file_comment;
	public int getFile_id() {
		return file_id;
	}
	public void setFile_id(int file_id) {
		this.file_id = file_id;
	}
	public int getClassinfo_id() {
		return classinfo_id;
	}
	public void setClassinfo_id(int classinfo_id) {
		this.classinfo_id = classinfo_id;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getFile_path() {
		return file_path;
	}
	public void setFile_path(String file_path) {
		this.file_path = file_path;
	}
	public String getFile_comment() {
		return file_comment;
	}
	public void setFile_comment(String file_comment) {
		this.file_comment = file_comment;
	}
	@Override
	public String toString() {
		return "File [file_id=" + file_id + ", classinfo_id=" + classinfo_id
				+ ", file_name=" + file_name + ", file_path=" + file_path
				+ ", file_comment=" + file_comment + "]";
	}
	
}
