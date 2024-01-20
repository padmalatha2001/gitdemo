package in.project.service;

import java.util.List;

import in.project.entity.Student;
import in.project.model.StudentModel;

public interface StudentService {
	
  public void save(Student student);
  public List<StudentModel> getStudents();
  StudentModel getStudentById(long id);
  public List<StudentModel> getStudentsByStream(String stream);
  public List<StudentModel> getStudentsByBranch(String branch);
  public StudentModel update(Student student);
  public void delete(long id);
}
