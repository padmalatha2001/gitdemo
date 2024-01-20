package in.project.service.impl;

import java.util.List;

import in.project.dao.CourseDAO;
import in.project.dao.impl.CourseDAOImpl;
import in.project.entity.Course;
import in.project.model.CourseModel;
import in.project.service.CourseService;

public class CourseServiceImpl implements CourseService{

	CourseDAO courseDAO=new CourseDAOImpl();
	
	public void save(Course course) {
		// TODO Auto-generated method stub
		courseDAO.save(course);
	}

	public List<CourseModel> getCourses() {
		// TODO Auto-generated method stub
		return courseDAO.getCourses();
		
	}

	public List<CourseModel> findByDept(String dept) {
		// TODO Auto-generated method stub
		return courseDAO.findByDept(dept);
	}

	public List<CourseModel> findById(long id) {
		// TODO Auto-generated method stub
		return courseDAO.findById(id);
	}

	public CourseModel update(Course course) {
		// TODO Auto-generated method stub
		return courseDAO.update(course);
	}

	public CourseModel updateDept(long id, String dept) {
		// TODO Auto-generated method stub
		return courseDAO.updateDept(id,dept);
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		courseDAO.delete(id);
		
	}

}
