package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.entity.Student;
import com.example.repository.StudentRepository;

@Component
public class StudentService {
     @Autowired
	private StudentRepository repository;
	public Student updateMarks(int id, int marks) {
		Student exitStudent=repository.findById(id).orElse(null);
		exitStudent.setStd_marks(marks);
		return repository.save(exitStudent);
	}

}
