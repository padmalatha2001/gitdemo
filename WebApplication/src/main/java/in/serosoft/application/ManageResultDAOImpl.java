package in.serosoft.application;

import org.hibernate.Session;

public class ManageResultDAOImpl implements ManageResultDAO {

	Utility utilty=new Utility();
	@Override
	public StudentDetails findById(String regNo) {
		Session session=utilty.getConnection().openSession();
		StudentDetails student=session.get(StudentDetails.class, regNo);
		return student;
	}

	@Override
	public StudentDetails findByName(String name) {
		Session session=utilty.getConnection().openSession();
		StudentDetails student=session.get(StudentDetails.class, name);
		return student;
	}

}
