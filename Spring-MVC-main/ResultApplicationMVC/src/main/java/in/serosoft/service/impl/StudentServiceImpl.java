package in.serosoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.serosoft.dao.StudentDAO;
import in.serosoft.entity.Student;
import in.serosoft.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentDAO studentDAO;

	@Override
	public Boolean create(Student student) {
		return studentDAO.create(student);
	}

	@Override
	public Student findById(Long id) {
		Student student=studentDAO.findById(id);
		return student;
	}

	@Override
	public List<Student> findAll() {
		List<Student> students=studentDAO.findAll();
		return students;
	}

}
