package com.project.dao;

import java.util.List;

import com.project.entity.Person;

public interface PersonDAO {
	
	public Boolean create(Person person);
	public Person findById(Long id);
	public List<Person> findAll();


}
