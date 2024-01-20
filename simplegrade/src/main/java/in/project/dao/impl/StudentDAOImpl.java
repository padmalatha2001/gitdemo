package in.project.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;

import in.project.configuration.Utility;
import in.project.dao.StudentDAO;
import in.project.entity.Student;
import in.project.model.StudentModel;

public class StudentDAOImpl implements StudentDAO{

	SessionFactory sessionFactory=Utility.getSessinFactory();
	
	public void save(Student student) {
		Session session=sessionFactory.openSession();
		session.save(student);
		Transaction transaction=session.beginTransaction();
		transaction.commit();
	}

	public List<StudentModel> getStudents() {
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Student.class);
		
		ProjectionList projections=Projections.projectionList();
		Projection p1=Projections.property("id");
		Projection p2=Projections.property("name");
		Projection p3=Projections.property("stream");
		Projection p4=Projections.property("branch");
		Projection p5=Projections.property("cgpa");
		projections.add(p1,"id");
		projections.add(p2,"name");
		projections.add(p3,"stream");
		projections.add(p4,"branch");
		projections.add(p5,"cgpa");
		
		criteria.setProjection(projections);
		criteria.setResultTransformer(Transformers.aliasToBean(StudentModel.class));
		return criteria.list();
	}

	public List<StudentModel> getStudentsByStream(String stream) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Student.class);
		
		ProjectionList projections=Projections.projectionList();
		Projection p1=Projections.property("id");
		Projection p2=Projections.property("name");
		Projection p3=Projections.property("stream");
		Projection p4=Projections.property("branch");
		Projection p5=Projections.property("cgpa");
		projections.add(p1,"id");
		projections.add(p2,"name");
		projections.add(p3,"stream");
		projections.add(p4,"branch");
		projections.add(p5,"cgpa");
		
		criteria.add(Restrictions.eq("stream",stream));
		criteria.setProjection(projections);
		criteria.setResultTransformer(Transformers.aliasToBean(StudentModel.class));
		return criteria.list();
	}

	public List<StudentModel> getStudentsByBranch(String branch) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Student.class);
		
		ProjectionList projections=Projections.projectionList();
		Projection p1=Projections.property("id");
		Projection p2=Projections.property("name");
		Projection p3=Projections.property("stream");
		Projection p4=Projections.property("branch");
		Projection p5=Projections.property("cgpa");
		projections.add(p1,"id");
		projections.add(p2,"name");
		projections.add(p3,"stream");
		projections.add(p4,"branch");
		projections.add(p5,"cgpa");
		
		criteria.add(Restrictions.eq("branch",branch));
		criteria.setProjection(projections);
		criteria.setResultTransformer(Transformers.aliasToBean(StudentModel.class));
		return criteria.list();
	}

	public StudentModel getStudentById(long id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Student.class);
		
		ProjectionList projections=Projections.projectionList();
		Projection p1=Projections.property("id");
		Projection p2=Projections.property("name");
		Projection p3=Projections.property("stream");
		Projection p4=Projections.property("branch");
		Projection p5=Projections.property("cgpa");
		projections.add(p1, "id");
		projections.add(p2,"name");
		projections.add(p3,"stream");
		projections.add(p4,"branch");
		projections.add(p5,"cgpa");
		
		criteria.add(Restrictions.eq("id",id));
		criteria.setProjection(projections);
		criteria.setResultTransformer(Transformers.aliasToBean(StudentModel.class));
		List<StudentModel> sm= criteria.list();
		return sm.get(0);
	}
	
	public StudentModel update(Student student) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		session.update(student);
		transaction.commit();
		StudentModel students=getStudentById(student.getId());
		
		return students;
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Student student=session.get(Student.class, id);
		session.delete(student);
		transaction.commit();
		
	}

	
	
	
	
	

}
