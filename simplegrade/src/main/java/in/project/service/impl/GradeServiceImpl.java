package in.project.service.impl;

import java.util.List;

import in.project.dao.GradeDAO;
import in.project.dao.impl.GradeDAOImpl;
import in.project.entity.Grade;
import in.project.model.GradeModel;
import in.project.service.GradeService;

public class GradeServiceImpl implements GradeService{

	GradeDAO gradeDAO=new GradeDAOImpl();
	public void save(Grade grade) {
		// TODO Auto-generated method stub
		gradeDAO.save(grade);
	}

	public List<GradeModel> getGrades() {
		// TODO Auto-generated method stub
		
		return gradeDAO.getGrades();
	}

}
