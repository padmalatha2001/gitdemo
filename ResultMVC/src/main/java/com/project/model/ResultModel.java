package com.project.model;

public class ResultModel {
	
	
	private String edc;
	private String dsp;
	private String maths;
	private String java;
	private String vlsi;
	private String english;
	private String status;
	private float cgpa;
	private float sgpa;
	
	private String admissionId;
	private String studentId;

	private String personName;
	private int age;
	private String dob;
	private Long contact;
	
	
	public ResultModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ResultModel(String edc, String dsp, String maths, String java, String vlsi, String english, String status,
			float cgpa, float sgpa, String admissionId, String studentId, String personName, int age, String dob,
			Long contact) {
		super();
		this.edc = edc;
		this.dsp = dsp;
		this.maths = maths;
		this.java = java;
		this.vlsi = vlsi;
		this.english = english;
		this.status = status;
		this.cgpa = cgpa;
		this.sgpa = sgpa;
		this.admissionId = admissionId;
		this.studentId = studentId;
		this.personName = personName;
		this.age = age;
		this.dob = dob;
		this.contact = contact;
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


	public String getAdmissionId() {
		return admissionId;
	}


	public void setAdmissionId(String admissionId) {
		this.admissionId = admissionId;
	}


	public String getStudentId() {
		return studentId;
	}


	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}


	public String getPersonName() {
		return personName;
	}


	public void setPersonName(String personName) {
		this.personName = personName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public Long getContact() {
		return contact;
	}


	public void setContact(Long contact) {
		this.contact = contact;
	}


	@Override
	public String toString() {
		return "ResultModel [edc=" + edc + ", dsp=" + dsp + ", maths=" + maths + ", java=" + java + ", vlsi=" + vlsi
				+ ", english=" + english + ", status=" + status + ", cgpa=" + cgpa + ", sgpa=" + sgpa + ", admissionId="
				+ admissionId + ", studentId=" + studentId + ", personName=" + personName + ", age=" + age + ", dob="
				+ dob + ", contact=" + contact + "]";
	}
	
	
	
	

}
