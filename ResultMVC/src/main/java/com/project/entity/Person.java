package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persons")
public class Person {

	@Id
	private long id;
	private String personName;
	private int age;
	private String dob;
	private long contact;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(long id, String personName, int age, String dob, long contact) {
		super();
		this.id = id;
		this.personName = personName;
		this.age = age;
		this.dob = dob;
		this.contact = contact;
	}

	public Person(long id) {
		super();
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	
	
}
