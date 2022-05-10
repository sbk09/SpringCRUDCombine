package com.example.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int std_id;
	private String std_name;
	private String std_branch;
	private int std_shift;
	private int std_marks;
	private String result;
	public int getStd_id() {
		return std_id;
	}
	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}
	public String getStd_name() {
		return std_name;
	}
	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}
	public String getStd_branch() {
		return std_branch;
	}
	public void setStd_branch(String std_branch) {
		this.std_branch = std_branch;
	}
	public int getStd_shift() {
		return std_shift;
	}
	public void setStd_shift(int std_shift) {
		this.std_shift = std_shift;
	}
	public int getStd_marks() {
		return std_marks;
	}
	public void setStd_marks(int std_marks) {
		this.std_marks = std_marks;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}

}
