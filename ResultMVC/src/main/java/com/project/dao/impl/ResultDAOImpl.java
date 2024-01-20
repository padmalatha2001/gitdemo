package com.project.dao.impl;

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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.project.dao.ResultDAO;
import com.project.entity.Result;
import com.project.model.ResultModel;

@Repository
public class ResultDAOImpl implements ResultDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Boolean create(Result result) {
		Session session=sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		session.save(result);
		t.commit();
		return true;
	}

	@Override
	public Result findById(Long id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Result result=session.get(Result.class, id);
		return result;
	}

	@Override
	public List<Result> findAll() {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Result.class);
		List<Result> results=criteria.list();
		return results;

	}

	@Override
	public ResultModel calculateResult(Long studentId) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Result.class);
		criteria.createAlias("student", "student");
		criteria.createAlias("student.person","person");
		
		ProjectionList proList=Projections.projectionList();
		Projection pro1=Projections.property("edc");
		Projection pro2=Projections.property("dsp");
		Projection pro3=Projections.property("maths");
		Projection pro4=Projections.property("java");
		Projection pro5=Projections.property("vlsi");
		Projection pro6=Projections.property("english");
		Projection pro7=Projections.property("status");
		Projection pro8=Projections.property("cgpa");
		Projection pro9=Projections.property("sgpa");
		Projection pro10=Projections.property("student.admissionId");
		Projection pro11=Projections.property("student.studentId");
		Projection pro12=Projections.property("person.personName");
		
		proList.add(pro1,"edc");
		proList.add(pro2,"dsp");
		proList.add(pro3,"maths");
		proList.add(pro4,"java");
		proList.add(pro5,"vlsi");
		proList.add(pro6,"english");
		proList.add(pro7,"status");
		proList.add(pro8,"cgpa");
		proList.add(pro9,"sgpa");
		proList.add(pro10,"admissionId");
		proList.add(pro11,"studentId");
		proList.add(pro12,"personName");
		
		if (studentId !=null)
			Restrictions.eq("student.studentId", studentId);
		criteria.setProjection(proList);
		criteria.setResultTransformer(Transformers.aliasToBean(ResultModel.class));
		
		List<ResultModel> results=criteria.list();
		
		return results.get(0);

	}

}
