package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.entity.Student;
import com.example.repository.StudentRepository;

public class SudentService {
	
	@Autowired
	private StudentRepository repo;
	
	
    public Student getStudentbyid(int id) {
    Student s1=	repo.findById(id).orElse(null);
    return s1;
    }

	
    
}
