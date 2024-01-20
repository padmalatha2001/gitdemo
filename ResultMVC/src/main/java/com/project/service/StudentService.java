package com.project.service;

import java.util.List;

import com.project.entity.Student;

public interface StudentService {
	
	public Boolean create(Student student);
	public Student findById(Long id);
	public List<Student> findAll();


}
