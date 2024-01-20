package in.serosoft.configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Utility {
	
	public SessionFactory getSession() {
		return new Configuration().configure().buildSessionFactory();
	}
	
	public Transaction getTransaction(Session session) {
		return session.beginTransaction();
	}
	
	/*
	public void commitTransaction(Session session) {
		session.beginTransaction();
	}
	*/

}
