package in.project.service;

import java.util.List;

import in.project.entity.Grade;
import in.project.model.GradeModel;

public interface GradeService {
	
	public void save(Grade grade);
	public List<GradeModel> getGrades();


}
