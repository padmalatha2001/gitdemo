package in.project.view;

import java.util.List;
import java.util.Scanner;

import in.project.entity.Student;
import in.project.model.StudentModel;
import in.project.resourse.StudentResource;

public class StudentMenu {

	Scanner scanner=new Scanner(System.in);
	StudentResource studentResource=new StudentResource();
	
	public void getMenu(){
		
		System.out.println("***************************");
		System.out.println("           Menu            ");
		System.out.println("***************************");
	    System.out.println("1.Add");
	    System.out.println("2.FindBYId");
	    System.out.println("3.FindBYStream");
	    System.out.println("4.FindBYBranch");
	    System.out.println("5.FindALL");
	    System.out.println("6.Update");
	    System.out.println("7.Delete");
	    System.out.println("Enter your choice..!");
	    startMenu();
	    
	}
	
	public Student addStudent()
	{
		Student student=new Student();
		
		System.out.println("Enter Student id:");
		student.setId(scanner.nextLong());
		System.out.println("Enter Student Name:");
		student.setName(scanner.next());
		//scanner.nextLine();
		System.out.println("Enter Student Age:");
		student.setAge(scanner.nextInt());
		System.out.println("Enter Student Stream");
		student.setStream(scanner.next());
		//scanner.nextLine();
		System.out.println("Enter Student Branch");
		student.setBranch(scanner.next());
		System.out.println("Enter Student Cgpa");
		student.setCgpa(scanner.nextDouble());
		System.out.println("Enter Student sgpa");
		student.setSgpa(scanner.nextDouble());
		
		return student;
		
	}
	
	public long getId() {
		
		 System.out.println("Enter Student Id:");
		 return scanner.nextLong();
	}
	
	public String getStream() {
		System.out.println("Enter Stream:");
		return scanner.next();
	}
	
	public String getBranch() {
		System.out.println("Enter Branch:");
		return scanner.next();
	}
	
	public void startMenu() {
		 int ch=scanner.nextInt();
		 long id;
		 Student student;
		 List<StudentModel> studentModel;
		 StudentModel studentModel1;
		 switch(ch) {
		
		     case 1:student=addStudent();
		            studentResource.save(student);
		            System.out.println("Record Added Successfully");
		            getMenu();
		            break;
		     case 2:studentModel1=studentResource.getStudentById(getId());
		            System.out.println(studentModel1);
		            getMenu();
		            break;
		     case 3:studentModel=studentResource.getStudentsByStream(getStream());
                    for(StudentModel sm:studentModel)
	                System.out.println(sm);
	                getMenu();
	                break;
		     case 4:studentModel=studentResource.getStudentsByBranch(getBranch());
                    for(StudentModel sm:studentModel)
                    System.out.println(sm);
                    getMenu();
                    break;
		     case 5:studentModel=studentResource.getStudents();
		            for(StudentModel sm:studentModel)
		            System.out.println(sm);
		            getMenu();
		            break;
		     case 6:student=addStudent();
	                studentResource.update(student);
	                System.out.println("Record Updated Successfully");
	                getMenu();
	                break;   
		    case 7:id=getId();
		           studentResource.delete(id);
		           System.out.println("Record Deleted Successfully");
		           getMenu();
		           break;
		    
		}
		
	}

}
