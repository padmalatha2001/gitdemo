package in.project.resourse;

import java.util.List;

import in.project.entity.Grade;
import in.project.model.GradeModel;
import in.project.service.GradeService;
import in.project.service.impl.GradeServiceImpl;

public class GradeResource {
	GradeService gradeService=new GradeServiceImpl();
	public void save(Grade grade) {
		// TODO Auto-generated method stub
		gradeService.save(grade);
	}

	public List<GradeModel> getGrades() {
		// TODO Auto-generated method stub
		
		return gradeService.getGrades();
	}

}
