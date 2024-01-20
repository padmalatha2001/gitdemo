package student;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class StudentDAO {

	public void setGradeValue(int id, int gId)
	{
	  Session session=new Config().getConfiguration();
	  Student1 student1=session.get(Student1.class, id);
	  student1.setGradeId(gId);
	  Transaction t=new Config().getTransaction(session);
	  t.commit();
	}
	
	
	public void setStatusValue(int id,int sId)
	{
		 Session session=new Config().getConfiguration();
		 Student1 student1=session.get(Student1.class, id);
	     student1.setStatusId(sId);
	     Transaction t=new Config().getTransaction(session);
	     t.commit();
	}
	
	public void setMarksValue(int id, int marks)
	{
	  Session session=new Config().getConfiguration();
	  Student1 student1=session.get(Student1.class, id);
	  student1.setMarks(marks);
	  Transaction t=new Config().getTransaction(session);
	  t.commit();
	}
}
