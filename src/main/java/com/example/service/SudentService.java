package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.entity.Student;
import com.example.repository.StudentRepository;

public class SudentService {
   @Autowired 
   private StudentRepository repo;
   
	public Student saveStudent(Student student) {
		
		return repo.save(student);
		
		}
	
	
	public Student updateMarks(int id, int marks) {
		Student exitStudent=repo.findById(id).orElse(null);
		exitStudent.setStd_marks(marks);
		return repo.save(exitStudent);
	}
}

