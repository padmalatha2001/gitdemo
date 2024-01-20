package in.project.view;

import java.util.List;
import java.util.Scanner;

import in.project.entity.Course;
import in.project.model.CourseModel;
import in.project.resourse.CourseResource;

public class CourseMenu {
	Scanner scanner=new Scanner(System.in);
	CourseResource courseResource=new CourseResource();
	
	public void getMenu(){
	
		System.out.println("***************************");
		System.out.println("           Menu            ");
		System.out.println("***************************");
	    System.out.println("1.Add");
	    System.out.println("2.FindBYId");
	    System.out.println("3.FindBYDept");
	    System.out.println("4.FindALL");
	    System.out.println("5.Update");
	    System.out.println("6.Update DEPT");
	    System.out.println("7.Delete");
	    System.out.println("Enter your choice..!");
	    startMenu();
	    
	}
	public Course addCourse() {
	   
		Course course=new Course();
	    System.out.println("Enter Course Id:");
	    course.setCourseId(scanner.nextLong());
	    System.out.println("Enter Course Name:");
	    course.setCourseName(scanner.next());
	    System.out.println("Enter Course Dept:");
	    scanner.nextLine();
	    course.setCourseDept(scanner.nextLine());
	    System.out.println("Enter Course Credits:");
	    course.setCourseCredits(scanner.nextInt());
	    System.out.println("Enter Consider CourseForPramotion:");
	    course.setConsiderCourseForPramotion(scanner.nextBoolean());
	    System.out.println("Enter Course Type:");
	    course.setCourseType(scanner.next());
	   
	    return course;
	    
	}
	
	public long getId() {
	
		 System.out.println("Enter Course Id:");
		 return scanner.nextLong();
	}
	
	public String getDept() {
		
		 System.out.println("Enter Course Dept:");
		 return scanner.next();
	}
	
	public void startMenu() {
		
		int ch=scanner.nextInt();
		long id;
		String dept;
		Course course;
		List<CourseModel> courseModel;
		switch(ch){
		
			case 1:course=addCourse();
			       courseResource.save(course);
			       System.out.println("Record saved Successfully...!");
			       getMenu();
			       break;
			case 2:id=getId();
			       courseModel=courseResource.findById(id);
			       System.out.println(courseModel.get(0));
			       getMenu();
			       break;
			case 3:dept=getDept();
		           courseModel=courseResource.findByDept(dept);
		           for(CourseModel cou:courseModel)
		        	   System.out.println(cou);
		           getMenu();
		           break;
			case 4: courseModel=courseResource.getCourses();
	                for(CourseModel cou:courseModel)
	        	       System.out.println(cou);
	                getMenu();
	                break;
			case 5: course=addCourse();
		            courseResource.update(course);
		            System.out.println("Record updated Successfully...!");
		            getMenu();
		            break;
			case 6: id=getId();
			        dept=getDept();
				    courseResource.updateDept(id,dept);
                    System.out.println("Record updated Successfully...!");
                    getMenu();
                    break; 
			case 7: id=getId();
		            courseResource.delete(id);
		            System.out.println("Record deleted Successfully...!");
		            getMenu();
		            break;
		   
			       
		}
		
		
	}

}
