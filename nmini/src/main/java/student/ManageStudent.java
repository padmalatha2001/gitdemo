package student;
import java.io.Serializable;
import java.util.*;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
public class ManageStudent {
	
	   public static void newStudent()
	   {
		    int id,age;
			String branch,stream,name;
			
			Scanner sc=new Scanner(System.in);
		   
			System.out.println("Please Enter Id");
	    	id=sc.nextInt();
	    	System.out.println("Please Enter Your Name");
	    	name=sc.next();
	    	System.out.println("Please Enter Your Course");
	    	stream=sc.next();
	    	System.out.println("Please Enter Your Branch");
	    	branch=sc.next();
	        System.out.println("Please Enter Your Age");
	    	age=sc.nextInt();
	    	
	        Session session=new Config().getConfiguration();
	        session.save(new Student1(id,name,stream,branch,age));
	        new Config().getTransaction(session).commit();
	        System.out.println("Please Wait Your Details Are Processing");
	        
	        
	   }

	   public static void setResultDetails()
	   {
		   int id,marks;
		   Scanner sc=new Scanner(System.in);
		   
		   StudentDAO studentDAO=new StudentDAO();
		   StudentService studentService=new StudentService();
		   Session session=new Config().getConfiguration();
		   
		   System.out.println("Please Enter Student Id");
		   id=sc.nextInt();
		   System.out.println("Please Enter Student Marks");
		   marks=sc.nextInt();
		   
		   studentDAO.setMarksValue(id,marks);
		   studentService.gradeCalculation(id,marks);
		   studentService.statusCalculation(id,marks);
		   
		   Student1 student1=session.get(Student1.class, id);
		   System.out.println("Please wait,Student Result Calculating....");
		   System.out.println("------------------------------------------");
           
		  
		   Grade grade=session.get(Grade.class,student1.getGradeId());
		   Status status=session.get(Status.class,student1.getStatusId());
		   System.out.println("Grade: "+grade.getGrade()+"\t\t\tStatus:"+status.getStatus());
	   }
		  
		   
		
	   public void fetchDetails()
	   {   
		   int id;
		   Scanner sc=new Scanner(System.in);
		   Session session=new Config().getConfiguration();
		   
		   
		   System.out.println("Please Enter Student Id");
		   id=sc.nextInt();
		   Student1 student1=session.get(Student1.class, id);
		   
		   System.out.println("Student Details:");
		   System.out.println("---------------------------------------------");
		   System.out.println(student1.getName()+"\n\n");
		   System.out.println("RollNo:"+student1.getId()+"					Age:"+student1.getAge());
		   System.out.println("Stream:"+student1.getId()+"				 Branch:"+student1.getBranch());
		   System.out.println("Marks :"+student1.getMarks()+"\n\n");
		   
		   Grade grade=session.get(Grade.class,student1.getGradeId());
		   Status status=session.get(Status.class,student1.getStatusId());
		   
		   System.out.println("Grade :"+grade.getGrade());
		   System.out.println("Status :"+status.getStatus());
	   }
	   
	   public static void main(String[] args) {
		
		   Scanner sc=new Scanner(System.in);
		   int k;
		   do{  
			    System.out.println("			******** MENU ********			");
		        System.out.println("1.Add Student\n2.Result Calculation\n3.Fetch Student Details ");
		        System.out.println("--------------------------------------------");
		        k=sc.nextInt();
		        if(k==1)
		    	    newStudent();
		        else if(k==2)
		    	     setResultDetails();
		        else if(k==3)
		        { 
		        	ManageStudent m=new ManageStudent();
		        	     m.fetchDetails();
		        }
		       
		     }while(k<4);
		   
		
		   
		/*studentService.gradeCalculation(2, 75);
		studentService.statusCalculation(2, 75);
		studentDAO.setMarksValue(2, 75);
		*/
		    
		    
	}

}
