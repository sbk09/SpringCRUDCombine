package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.SudentService;
@RestController
public class StudentController {
	//controller//
	
	private SudentService service;
	@GetMapping("/student/{id}")
	public  Student getStudentById(@PathVariable("id") int id) {
		
		return service.getStudentbyid(id);
	}
	
	

}
