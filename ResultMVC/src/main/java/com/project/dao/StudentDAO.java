package com.project.dao;

import java.util.List;

import com.project.entity.Student;

public interface StudentDAO {
	
	public Boolean create(Student student);
	public Student findById(Long id);
	public List<Student> findAll();


}
