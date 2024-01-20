package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {

	@Id
	private Long id;
	private String admissionId;
	private String studentId;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "personId")
	private Person person;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(Long id) {
		super();
		this.id = id;
	}

	public Student(Long id, String admissionId, String studentId, Person person) {
		super();
		this.id = id;
		this.admissionId = admissionId;
		this.studentId = studentId;
		this.person = person;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
}
