package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.StudentDAO;
import com.project.entity.Student;
import com.project.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;

	@Override
	public Boolean create(Student student) {
		// TODO Auto-generated method stub
		return studentDAO.create(student);
	}

	@Override
	public Student findById(Long id) {
		// TODO Auto-generated method stub
		return studentDAO.findById(id);
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return studentDAO.findAll();
	}

}
