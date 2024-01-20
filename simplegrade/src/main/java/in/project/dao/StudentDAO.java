package in.project.dao;

import java.util.List;

import in.project.entity.Student;
import in.project.model.StudentModel;

public interface StudentDAO {

	 void save(Student student);
	 List<StudentModel> getStudents();
	 StudentModel getStudentById(long id);
	 List<StudentModel> getStudentsByStream(String stream);
	 List<StudentModel> getStudentsByBranch(String branch);
	 StudentModel update(Student student);
	 void delete(long id);
	 
}
