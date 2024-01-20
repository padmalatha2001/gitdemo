package student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Config {

	public Session getConfiguration()
	{
		Configuration configuration=new Configuration().configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		return session;
		
	}
	public Transaction getTransaction(Session s)
	{
		return s.beginTransaction();
	}
	

}
