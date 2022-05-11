package com.example.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.StudentService;

@RestController
public class StudentController {
	@Autowired
  private StudentService service;	
	
	//controller//
	
	@GetMapping("/student/{id}")
	public  Student getStudentById(@PathVariable("id") int id) {
		
		return service.getStudentbyid(id);
	}
	
	

	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student std) {
		
		return service.saveStudent(std);
		
	}
	
	
	@GetMapping("/students")
	public List<Student> getStudents(){
		return null;
	}
	
	@PatchMapping("/student/{id}/{marks}")
	public Student updateMarks(@PathVariable("id") int id, @PathVariable("marks") int marks) {
		return service.updateMarks(id,marks);
	}
}
