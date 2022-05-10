package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.SudentService;

@RestController
public class StudentController {
	//controller//
	@Autowired
	private SudentService service;
	@GetMapping("/students")
	public List<Student> getStudents(){
		return null;
	}
	
	@PatchMapping("/student/{id}/{marks}")
	public Student updateMarks(@PathVariable("id") int id, @PathVariable("marks") int marks) {
		return service.updateMarks(id,marks);
	}
}
