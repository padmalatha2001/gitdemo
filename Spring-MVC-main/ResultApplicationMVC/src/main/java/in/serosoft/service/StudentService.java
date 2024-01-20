package in.serosoft.service;

import java.util.List;

import in.serosoft.entity.Student;

public interface StudentService {
	
	public Boolean create(Student Student);
	public Student findById(Long id);
	public List<Student> findAll();


}
