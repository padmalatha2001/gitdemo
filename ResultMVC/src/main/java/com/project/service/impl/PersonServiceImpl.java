package com.project.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.PersonDAO;
import com.project.entity.Person;
import com.project.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDAO personDAO;
	
	@Override
	public Boolean create(Person person) {
		// TODO Auto-generated method stub
		return personDAO.create(person);
	}

	@Override
	public Person findById(Long id) {
		// TODO Auto-generated method stub
		return personDAO.findById(id);
	}

	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return personDAO.findAll();
	}

}
