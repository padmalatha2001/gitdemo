package in.project.configuration;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Utility {
	public static SessionFactory getSessinFactory(){
		Configuration configuration=new Configuration().configure();
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		return sessionFactory;
		
	}

}
//<property name="hibernate.show_sql">true</property>