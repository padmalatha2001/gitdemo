package in.serosoft.dao;

import java.util.List;

import in.serosoft.entity.Person;

public interface PersonDAO {
	
	public Boolean create(Person person);
	public Person findById(Long id);
	public List<Person> findAll();


}
