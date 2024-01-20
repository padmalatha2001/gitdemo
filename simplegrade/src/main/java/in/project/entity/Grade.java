package in.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="grade")
public class Grade {
    
	@Id
	long id;
	String gradeName;
	String gradeType;
	long gradeRangeFrom;
	long gradeRangeTo;
	String gradeStatus;
	
	
	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Grade(long id, String gradeName, String gradeType, long gradeRangeFrom, long gradeRangeTo,
			String gradeStatus) {
		super();
		this.id = id;
		this.gradeName = gradeName;
		this.gradeType = gradeType;
		this.gradeRangeFrom = gradeRangeFrom;
		this.gradeRangeTo = gradeRangeTo;
		this.gradeStatus = gradeStatus;
	}
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getGradeName() {
		return gradeName;
	}
	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
	public String getGradeType() {
		return gradeType;
	}
	public void setGradeType(String gradeType) {
		this.gradeType = gradeType;
	}
	public long getGradeRangeFrom() {
		return gradeRangeFrom;
	}
	public void setGradeRangeFrom(long gradeRangeFrom) {
		this.gradeRangeFrom = gradeRangeFrom;
	}
	public long getGradeRangeTo() {
		return gradeRangeTo;
	}
	public void setGradeRangeTo(long gradeRangeTo) {
		this.gradeRangeTo = gradeRangeTo;
	}
	public String getGradeStatus() {
		return gradeStatus;
	}
	public void setGradeStatus(String gradeStatus) {
		this.gradeStatus = gradeStatus;
	}


	@Override
	public String toString() {
		return "Grade [id=" + id + ", gradeName=" + gradeName + ", gradeType=" + gradeType + ", gradeRangeFrom="
				+ gradeRangeFrom + ", gradeRangeTo=" + gradeRangeTo + ", gradeStatus=" + gradeStatus + "]";
	}
	
	
	
}
