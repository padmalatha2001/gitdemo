package in.project.service.impl;

import java.util.List;

import in.project.dao.StudentDAO;
import in.project.dao.impl.StudentDAOImpl;
import in.project.entity.Student;
import in.project.model.StudentModel;
import in.project.service.StudentService;

public class StudentServiceImpl implements StudentService{

	StudentDAO studentDAO=new StudentDAOImpl();
	
	public void save(Student student) {
		
		studentDAO.save(student);
	}

	public List<StudentModel> getStudents() {
		// TODO Auto-generated method stub
		return studentDAO.getStudents();
	}

	public List<StudentModel> getStudentsByStream(String stream) {
		// TODO Auto-generated method stub
		return studentDAO.getStudentsByStream(stream);
	}

	public List<StudentModel> getStudentsByBranch(String branch) {
		// TODO Auto-generated method stub
		return studentDAO.getStudentsByBranch(branch);
	}

	public StudentModel update(Student student) {
		// TODO Auto-generated method stub
		return studentDAO.update(student);
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		studentDAO.delete(3);
		
	}

	public StudentModel getStudentById(long id) {
		// TODO Auto-generated method stub
		return studentDAO.getStudentById(id);
	}

}
