package in.project.model;

public class CourseModel {
	
	long courseId;
	String courseName;
	String courseDept;
	int courseCredits;
	boolean considerCourseForPramotion;
	String courseType;
	
	
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
		return "CourseModel [courseId=" + courseId + ", courseName=" + courseName + ", courseDept=" + courseDept
				+ ", courseCredits=" + courseCredits + ", considerCourseForPramotion=" + considerCourseForPramotion
				+ ", courseType=" + courseType + "]";
	}
	
	
	

}
