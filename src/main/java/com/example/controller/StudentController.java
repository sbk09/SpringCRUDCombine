package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.service.SudentService;

@RestController
public class StudentController {
	@Autowired
  private SudentService service;	
	
	//controller//

	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student std) {
		
		return service.saveStudent(std);
		
	}
	
	
}
