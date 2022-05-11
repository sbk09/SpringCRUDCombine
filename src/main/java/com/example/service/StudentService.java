package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.entity.Student;
import com.example.repository.StudentRepository;

   
	
	
@Component
public class StudentService {
     @Autowired
	private StudentRepository repo;
	public Student updateMarks(int id, int marks) {
		Student exitStudent=repo.findById(id).orElse(null);
		exitStudent.setStd_marks(marks);
		return repo.save(exitStudent);
	}
public Student saveStudent(Student student) {
	
	return repo.save(student);
	
}
public Student getStudentbyid(int id) {
	// TODO Auto-generated method stub
	
	Student s1= repo.findById(id).orElse(null);
	return s1;
}
}

