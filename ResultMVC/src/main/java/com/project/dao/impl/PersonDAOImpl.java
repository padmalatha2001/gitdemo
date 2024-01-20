package com.project.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.dao.PersonDAO;
import com.project.entity.Person;

@Repository
public class PersonDAOImpl implements PersonDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Boolean create(Person person) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		session.save(person);
		t.commit();
		return true;
	}

	@Override
	public Person findById(Long id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Person person=session.get(Person.class, id);
		return person;
	}

	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Person.class);
		List<Person> persons=criteria.list();
		return persons;
	}

}
