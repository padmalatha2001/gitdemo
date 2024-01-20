package hibernatesample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentHelperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Configuration configuration=new Configuration().configure();
           SessionFactory sf=configuration.buildSessionFactory();
           Session s=sf.openSession();
           Transaction t=s.beginTransaction();
           
      /*  s.save(new Student(7,"raj",'F',"ECE",76.5));
           s.save(new Student(8,"siri",'F',"MECH",95.8));
           s.save(new Student(3,"sravs",'F',"CSE",90.4));
           s.save(new Student(4,"raju",'F',"ECE",76.5));
           s.save(new Student(5,"sr",'F',"MECH",95.8));
           s.save(new Student(6,"sra",'F',"CSE",90.4));
          */ 
           
           
          // t.commit();
        
         for( int i=1;i<9;i++) 
         {
        	 Student st=s.get(Student.class, i);
        	 System.out.println(st.toString());
         }
           /*st.setSname("krishna");
           
          st=s.get(Student.class, 3);
          System.out.println(st);
           s.delete(st);*/
           t.commit();
           
           
	}

}
