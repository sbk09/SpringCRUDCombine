package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.entity.Student;

public class StudentController {
	//controller//
	@GetMapping("/students")
	public List<Student> getStudents(){
		return null;
	}
	
	@PatchMapping("/student/{id}/{marks}")
	public Student updateMarks(@PathVariable("id") int id, @PathVariable("marks") int marks) {
		return null;
	}
}
