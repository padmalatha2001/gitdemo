package in.serosoft.service;

import java.util.List;

import in.serosoft.entity.Person;

public interface PersonService {
	
	public Boolean create(Person person);
	public Person findById(Long id);
	public List<Person> findAll();


}
