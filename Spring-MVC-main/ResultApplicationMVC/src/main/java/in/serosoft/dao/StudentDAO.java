package in.serosoft.dao;

import java.util.List;

import in.serosoft.entity.Person;
import in.serosoft.entity.Student;

public interface StudentDAO {
	
	public Boolean create(Student Student);
	public Student findById(Long id);
	public List<Student> findAll();


}
