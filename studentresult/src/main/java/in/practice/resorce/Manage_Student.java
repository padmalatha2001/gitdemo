package in.practice.resorce;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import in.practice.configuration.Configure;
import in.practice.dao.StudentDAO;
import in.practice.entity.Grade;
import in.practice.entity.Status;
import in.practice.entity.Student12;
import in.practice.service.StudentService1;

public class Manage_Student {
	
	public static void addNewStudent()
	{
		int id,age;
		String branch,stream,name;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Id:");
		id=sc.nextInt();
		System.out.println("Please Enter Name:");
		name=sc.next();
		System.out.println("Please Enter Course");
		stream=sc.next();
		System.out.println("Please Enter Branch");
		branch=sc.next();
		System.out.println("Please Enter Age");
		age=sc.nextInt();
		
		Session session=Configure.getConfiguration();
		session.save(new Student12(id,name,stream,branch,age));
		Configure.getTransaction(session).commit();
		System.out.println("Please wait details are processing");
	}
	
	public static void setResultDetails()
	{
		int id,marks,sid,gid;
		
		Session session=Configure.getConfiguration();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter id");
		id=sc.nextInt();
		System.out.println("Please Enter marks");
		marks=sc.nextInt();
		
		StudentDAO.setMarksValue(id, marks);
		StudentService1 studentservice=new StudentService1();
		gid=studentservice.gradeCalculation(id, marks);
		sid=studentservice.statusCalculation(id, marks);
		Student12 student12=session.get(Student12.class,id);
		System.out.println("Please wait,Student Result Calculating....");
		System.out.println("------------------------------------------");
          
		Grade grade=session.get(Grade.class, gid);
		Status status=session.get(Status.class, sid);
		System.out.println("Grade: "+grade.getGrade()+"\t\t\tStatus:"+status.getStatus());
		
	}
	
	public static void fetchStudentDetails()
	{
		int id;
		Session session=Configure.getConfiguration();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Please Enter id");
		id=sc.nextInt();
		
		Student12 student12=session.get(Student12.class, id);
		   System.out.println("Student Details:");
		   System.out.println("---------------------------------------------");
		   System.out.println(student12.getName()+"\n\n");
		   System.out.println("RollNo:"+student12.getId()+"					Age:"+student12.getAge());
		   System.out.println("Stream:"+student12.getId()+"				 Branch:"+student12.getBranch());
		   System.out.println("Marks :"+student12.getMarks()+"\n\n");
		   
		   Grade grade=session.get(Grade.class,student12.getGradeid());
		   Status status=session.get(Status.class,student12.getStatusid());
		   System.out.println(student12.getStatusid());
		   
		   System.out.println("Grade :"+grade.getGrade());
		   System.out.println("Status :"+status.getStatus());
	}
	
	public static void report()
	{
		Session session=Configure.getConfiguration();
		
		Criteria myCriteria=session.createCriteria(Student12.class);
		Projection projection=Projections.property("name");
	
		myCriteria.setProjection(projection);

		List list=myCriteria.list();
		Configure.getTransaction(session);
		Iterator i=list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k;
		do{
			System.out.println("		*****Menu***** 			");
			System.out.println("1.Add Student\n2.Result Calculation\n3.Fetch Student Details\n4.Names");
	        System.out.println("--------------------------------------------");
	        k=sc.nextInt();
	        if(k==1)
	        	addNewStudent();
	        else if(k==2)
	        	setResultDetails();
	        else if(k==3)
	        {
	        	Manage_Student m=new Manage_Student();
	        	m.fetchStudentDetails();
	        }
	        else
	          report();
	        	
		}while(k<5);
        
	}

}
