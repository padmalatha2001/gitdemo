package com.project.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.dao.StudentDAO;
import com.project.entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Boolean create(Student student) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		session.save(student);
		t.commit();
		return true;

	}

	@Override
	public Student findById(Long id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Student student=session.get(Student.class, id);
		return student;
	}

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Student.class);
		List<Student> students=criteria.list();
		return students;
	}

}
