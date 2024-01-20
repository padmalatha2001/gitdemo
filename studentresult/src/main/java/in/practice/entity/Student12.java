package in.practice.entity;

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
@Table(name="student12")
public class Student12 {
   
	@Id
	private int id;
	private String name;
	private String stream;
	private String branch;
	private int age;
	private int marks;
	private int gradeid;
	private int statusid;
	
	
	
	public Student12() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student12(int id, String name, String stream, String branch, int age) {
		super();
		this.id = id;
		this.name = name;
		this.stream = stream;
		this.branch = branch;
		this.age = age;
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
	public int getGradeid() {
		return gradeid;
	}
	public void setGradeid(int gradeid) {
		this.gradeid = gradeid;
	}
	public int getStatusid() {
		return statusid;
	}
	public void setStatusid(int ststusid) {
		this.statusid = ststusid;
	}
	
	
	@Override
	public String toString() {
		return "Student12 [id=" + id + ", name=" + name + ", stream=" + stream + ", branch=" + branch + ", age=" + age
				+ ", marks=" + marks + ", gradeid=" + gradeid + ", statusid=" + statusid + "]";
	}
	
	
	
}
