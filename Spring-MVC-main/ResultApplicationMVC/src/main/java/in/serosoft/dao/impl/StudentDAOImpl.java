package in.serosoft.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import in.serosoft.dao.StudentDAO;
import in.serosoft.entity.Student;

@Repository
public class StudentDAOImpl implements StudentDAO{
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Boolean create(Student student) {
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		session.save(student);
		t.commit();
		return true;
	}

	@Override
	public List<Student> findAll() {
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Student.class);
		List<Student> students=criteria.list();
		return students;
	}

	@Override
	public Student findById(Long id) {
		Session session=sessionFactory.openSession();
		Student student=session.get(Student.class, id);
		return student;
	}

}
