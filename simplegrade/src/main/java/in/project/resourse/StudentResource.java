package in.project.resourse;

import java.util.List;

import in.project.entity.Student;
import in.project.model.StudentModel;
import in.project.service.StudentService;
import in.project.service.impl.StudentServiceImpl;

public class StudentResource {
	
	StudentService studentService=new StudentServiceImpl();
	
	public void save(Student student) {
	   studentService.save(student);	
	}
	
	public List<StudentModel> getStudents() {
		// TODO Auto-generated method stub
		return studentService.getStudents();
	}
	
	public List<StudentModel> getStudentsByStream(String stream) {
		return studentService.getStudentsByStream(stream);
	}

    public List<StudentModel> getStudentsByBranch(String branch) {
    	return studentService.getStudentsByBranch(branch);
    }
    
    public StudentModel update(Student student) {
    	return studentService.update(student);
    }
    
    public void delete(long id) {
        studentService.delete(id);
    }
    
    public StudentModel getStudentById(long id) {
		// TODO Auto-generated method stub
		return studentService.getStudentById(id);
	}
}
