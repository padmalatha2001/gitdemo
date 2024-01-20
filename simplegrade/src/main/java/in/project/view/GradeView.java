package in.project.view;

import java.util.List;

import in.project.entity.Grade;
import in.project.model.GradeModel;
import in.project.resourse.GradeResource;

public class GradeView {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GradeResource gradeResource=new GradeResource();
		
		/*Grade grade=new Grade(3,"B","Absolute",70,80,"Pass");
		gradeResource.save(grade);
		Grade grade1=new Grade(4,"C","Absolute",60,70,"Pass");
		gradeResource.save(grade1);
		Grade grade2=new Grade(5,"D","Absolute",50,60,"Pass");
		gradeResource.save(grade2);
		Grade grade3=new Grade(6,"E","Absolute",40,50,"Pass");
		gradeResource.save(grade3);
		Grade grade4=new Grade(7,"F","Absolute",0,40,"Fail");
		gradeResource.save(grade4);*/
		
		List<GradeModel> grades=gradeResource.getGrades();
		
		for(GradeModel g:grades)
			System.out.println(g);

	}

}
