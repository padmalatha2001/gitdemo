package in.serosoft.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Utility {
	
	public static SessionFactory getConfiguration() {
		Configuration configuration=new Configuration().configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory();		
		return sessionFactory;
	}

}
