package in.project.resourse;

import java.util.List;

import in.project.entity.Course;
import in.project.model.CourseModel;
import in.project.service.CourseService;
import in.project.service.impl.CourseServiceImpl;

public class CourseResource {
	
	CourseService courseService=new CourseServiceImpl();
	public void save(Course course) {
		// TODO Auto-generated method stub
		courseService.save(course);
	}

	public List<CourseModel> getCourses() {
		// TODO Auto-generated method stub
		return courseService.getCourses();
		
	}
	
	public List<CourseModel> findByDept(String dept) {
	
		return courseService.findByDept(dept);
	}
    
	public List<CourseModel> findById(long id) {
		// TODO Auto-generated method stub
		return courseService.findById(id);
	}
	
	public CourseModel update(Course course) {
		// TODO Auto-generated method stub
		return courseService.update(course);
	}
	
	public CourseModel updateDept(long id, String dept) {
		// TODO Auto-generated method stub
		return courseService.updateDept(id,dept);
	}
    
	public void delete(long id){
		
		courseService.delete(id);
	}
	

}
