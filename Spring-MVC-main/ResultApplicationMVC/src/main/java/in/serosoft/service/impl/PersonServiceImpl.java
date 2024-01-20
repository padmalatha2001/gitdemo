package in.serosoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.serosoft.dao.PersonDAO;
import in.serosoft.entity.Person;
import in.serosoft.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService{
	
	
	@Autowired
	private PersonDAO personDAO;

	@Override
	public Boolean create(Person person) {
		return personDAO.create(person);
	}

	@Override
	public Person findById(Long id) {
		return personDAO.findById(id);
	}

	@Override
	public List<Person> findAll() {
		return personDAO.findAll();
	}

}
