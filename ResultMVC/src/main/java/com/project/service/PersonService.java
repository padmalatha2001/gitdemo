package com.project.service;

import java.util.List;

import com.project.entity.Person;

public interface PersonService {

	public Boolean create(Person person);
	public Person findById(Long id);
	public List<Person> findAll();
}
