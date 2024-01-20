package in.practice.configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Configure {

	public static Session getConfiguration()
	{
		Configuration con=new Configuration().configure();
		SessionFactory sessionFactory=con.buildSessionFactory();
		Session session=sessionFactory.openSession();
		return session;
	}
	
	public static Transaction getTransaction(Session session)
	{
		return session.beginTransaction();
		
	}
}
