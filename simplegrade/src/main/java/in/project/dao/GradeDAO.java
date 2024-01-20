package in.project.dao;

import in.project.entity.Grade;
import in.project.model.GradeModel;

import java.util.*;

public interface GradeDAO {
	
	public void save(Grade grade);
	public List<GradeModel> getGrades();

}
