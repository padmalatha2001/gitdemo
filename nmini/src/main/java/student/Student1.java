package student;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="student1")
public class Student1 {
	
	@Id
	private int id;
	
	private String name;
	private String stream;
	private String branch;
	private int age;
	private int marks;
	private int gradeId;
	private int statusId;
	
	
	
	public Student1(int id, String name, String stream, String branch, int age, int marks, int gradeId, int statusId) {
		super();
		this.id = id;
		this.name = name;
		this.stream = stream;
		this.branch = branch;
		this.age = age;
		this.marks = marks;
		this.gradeId = gradeId;
		this.statusId = statusId;
	}
	



	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}




	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", stream=" + stream + ", branch=" + branch + ", age=" + age
				+ ", marks=" + marks + ", gradeId=" + gradeId + ", statusId=" + statusId + "]";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getStream() {
		return stream;
	}



	public void setStream(String stream) {
		this.stream = stream;
	}



	public String getBranch() {
		return branch;
	}



	public void setBranch(String branch) {
		this.branch = branch;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getMarks() {
		return marks;
	}



	public void setMarks(int marks) {
		this.marks = marks;
	}



	public int getGradeId() {
		return gradeId;
	}



	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}



	public int getStatusId() {
		return statusId;
	}



	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}



	public Student1(int id, String name, String stream, String branch, int age) {
		super();
		this.id = id;
		this.name = name;
		this.stream = stream;
		this.branch = branch;
		this.age = age;
	}
	
	

}
