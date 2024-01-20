package in.practice.dao;

import org.hibernate.Session;

import in.practice.configuration.Configure;
import in.practice.entity.Student12;

public class StudentDAO {
    public static void setGradeValue(int id,int gid)
    {
    	Session session=Configure.getConfiguration();
    	Student12 student12=session.get(Student12.class,id);
    	student12.setGradeid(gid);
    	Configure.getTransaction(session).commit();
    	
    }
    public static void setStatusValue(int id,int sid)
    {
    	Session session=Configure.getConfiguration();
    	Student12 student12=session.get(Student12.class,id);
    	student12.setStatusid(sid);
    	Configure.getTransaction(session).commit();
    	
    }
	public static void setMarksValue(int id,int marks)
	{
		Session session=Configure.getConfiguration(); 
		Student12 student12=session.get(Student12.class,id);
		student12.setMarks(marks);
		Configure.getTransaction(session).commit();
		
	}
}
