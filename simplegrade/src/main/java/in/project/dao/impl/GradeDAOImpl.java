package in.project.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projection;

import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;

import in.project.configuration.Utility;
import in.project.dao.GradeDAO;
import in.project.entity.Grade;
import in.project.model.GradeModel;

public class GradeDAOImpl implements GradeDAO{
  
	SessionFactory sessionFactory=Utility.getSessinFactory();
	
	public void save(Grade grade) {
		// TODO Auto-generated method stub
	  Session session=sessionFactory.openSession();
	  Transaction transaction=session.beginTransaction();
	  session.save(grade);
	  transaction.commit();
	}

	public List<GradeModel> getGrades() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Grade.class);
		
		ProjectionList projections=Projections.projectionList();
		Projection p1=Projections.property("id");
		Projection p2=Projections.property("gradeName");
		Projection p3=Projections.property("gradeType");
		Projection p4=Projections.property("gradeStatus");
		projections.add(p1,"id");
		projections.add(p2,"gradeName");
		projections.add(p3,"gradeType");
		projections.add(p4,"gradeStatus");
		
		criteria.setProjection(projections);
		criteria.setResultTransformer(Transformers.aliasToBean(GradeModel.class));
		return criteria.list();
		
	}

}
