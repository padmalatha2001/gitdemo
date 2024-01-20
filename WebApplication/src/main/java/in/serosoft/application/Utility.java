package in.serosoft.application;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Utility {
	
	public SessionFactory getConnection() {
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		return sessionFactory;
	}

}
