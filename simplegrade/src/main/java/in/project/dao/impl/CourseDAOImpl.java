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
import in.project.dao.CourseDAO;
import in.project.entity.Course;
import in.project.model.CourseModel;

public class CourseDAOImpl implements CourseDAO{

   SessionFactory sessionFactory=Utility.getSessinFactory();
	
	public void save(Course course) {
		// TODO Auto-generated method stub
	  Session session=sessionFactory.openSession();
	  Transaction transaction=session.beginTransaction();
	  session.save(course);
	  transaction.commit();
	}
	
	public List<CourseModel> getCourses() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Course.class);
		
		ProjectionList projections=Projections.projectionList();
		Projection p1=Projections.property("courseId");
		Projection p2=Projections.property("courseName");
		Projection p3=Projections.property("courseDept");
		Projection p4=Projections.property("courseType");
		projections.add(p1,"courseId");
		projections.add(p2,"courseName");
		projections.add(p3,"courseDept");
		projections.add(p4,"courseType");
		
		criteria.setProjection(projections);
		criteria.setResultTransformer(Transformers.aliasToBean(CourseModel.class));
		return criteria.list();
	}

	public List<CourseModel> findByDept(String dept) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Course.class);
		
		ProjectionList projections=Projections.projectionList()
				.add(Projections.property("courseName"),"courseName")
				.add(Projections.property("courseDept"),"courseDept")
				.add(Projections.property("courseCredits"),"courseCredits")
				.add(Projections.property("courseType"),"courseType");
		
		if(dept!=null)
		    criteria.add(Restrictions.eq("courseDept", dept));
		
		criteria.setProjection(projections);
		criteria.setResultTransformer(Transformers.aliasToBean(CourseModel.class));
		
		return criteria.list();
	}

	public List<CourseModel> findById(long id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Course.class);
		
		ProjectionList projections=Projections.projectionList()
				.add(Projections.property("courseName"),"courseName")
				.add(Projections.property("courseDept"),"courseDept")
				.add(Projections.property("courseCredits"),"courseCredits")
				.add(Projections.property("courseType"),"courseType");
		
		if(id!=0)
			criteria.add(Restrictions.eq("courseId",id));
		criteria.setProjection(projections);
		criteria.setResultTransformer(Transformers.aliasToBean(CourseModel.class));
		
		return criteria.list();
	}

	public CourseModel update(Course course) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		session.update(course);
	    transaction.commit();
		List<CourseModel> courses=findById(course.getCourseId());
	    
		return courses.get(0);
	}

	public CourseModel updateDept(long id, String dept) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
	    Course course=session.get(Course.class,id);
	    course.setCourseDept(dept);
	    
	    session.update(course);
	    transaction.commit();
	    
        List<CourseModel> courses=findById(course.getCourseId());
	    return courses.get(0);
	}

	public void delete(long id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
		Course course=session.get(Course.class, id);
		session.delete(course);
		transaction.commit();
		
		
	}
}
