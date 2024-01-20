package in.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	
	@Id
	long courseId;
	String courseName;
	String courseDept;
	int courseCredits;
	boolean considerCourseForPramotion;
	String courseType;
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Course(long courseId, String courseName, String courseDept, int courseCredits,
			boolean considerCourseForPramotion, String courseType) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDept = courseDept;
		this.courseCredits = courseCredits;
		this.considerCourseForPramotion = considerCourseForPramotion;
		this.courseType = courseType;
	}


	public long getCourseId() {
		return courseId;
	}


	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getCourseDept() {
		return courseDept;
	}


	public void setCourseDept(String courseDept) {
		this.courseDept = courseDept;
	}


	public int getCourseCredits() {
		return courseCredits;
	}


	public void setCourseCredits(int courseCredits) {
		this.courseCredits = courseCredits;
	}


	public boolean isConsiderCourseForPramotion() {
		return considerCourseForPramotion;
	}


	public void setConsiderCourseForPramotion(boolean considerCourseForPramotion) {
		this.considerCourseForPramotion = considerCourseForPramotion;
	}


	public String getCourseType() {
		return courseType;
	}


	public void setCourseType(String courseType) {
		this.courseType = courseType;
	}


	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseDept=" + courseDept
				+ ", courseCredits=" + courseCredits + ", considerCourseForPramotion=" + considerCourseForPramotion
				+ ", courseType=" + courseType + "]";
	}
	
	
	

}
