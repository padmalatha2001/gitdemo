package in.project.service;

import java.util.List;

import in.project.entity.Course;
import in.project.model.CourseModel;

public interface CourseService {
	
	public void save(Course course);
	public List<CourseModel> getCourses();
	public List<CourseModel> findByDept(String dept);
	public List<CourseModel> findById(long id);
	public CourseModel update(Course course);
	public CourseModel updateDept(long id,String dept);
	public void delete(long id);
	
}
