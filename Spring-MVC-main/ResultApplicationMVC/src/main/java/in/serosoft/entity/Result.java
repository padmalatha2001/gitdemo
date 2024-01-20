package in.serosoft.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="results")
public class Result {
	
	@Id
	private int id;
	private String edc;
	private String dsp;
	private String maths;
	private String java;
	private String vlsi;
	private String english;
	private String status;
	private float cgpa;
	private float sgpa;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "studentId")
	private Student student;

	public Result(int id, String edc, String dsp, String maths, String java, String vlsi, String english, String status,
			float cgpa, float sgpa, Student student) {
		super();
		this.id = id;
		this.edc = edc;
		this.dsp = dsp;
		this.maths = maths;
		this.java = java;
		this.vlsi = vlsi;
		this.english = english;
		this.status = status;
		this.cgpa = cgpa;
		this.sgpa = sgpa;
		this.student = student;
	}


	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEdc() {
		return edc;
	}


	public void setEdc(String edc) {
		this.edc = edc;
	}


	public String getDsp() {
		return dsp;
	}


	public void setDsp(String dsp) {
		this.dsp = dsp;
	}


	public String getMaths() {
		return maths;
	}


	public void setMaths(String maths) {
		this.maths = maths;
	}


	public String getJava() {
		return java;
	}


	public void setJava(String java) {
		this.java = java;
	}


	public String getVlsi() {
		return vlsi;
	}


	public void setVlsi(String vlsi) {
		this.vlsi = vlsi;
	}


	public String getEnglish() {
		return english;
	}


	public void setEnglish(String english) {
		this.english = english;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public float getCgpa() {
		return cgpa;
	}


	public void setCgpa(float cgpa) {
		this.cgpa = cgpa;
	}


	public float getSgpa() {
		return sgpa;
	}


	public void setSgpa(float sgpa) {
		this.sgpa = sgpa;
	}

	
}
