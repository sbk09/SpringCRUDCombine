package com.example.controller;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.entity.Student;

public class StudentController {
	//controller//
	
	@PatchMapping("/student/{id}/{marks}")
	public Student updateMarks(@PathVariable("id") int id, @PathVariable("marks") int marks) {
		return null;
	}
}
