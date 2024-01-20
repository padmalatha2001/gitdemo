package student;

import java.util.LinkedHashMap;
import java.util.Map;

public class StudentService {
	
	public int gradeCalculation(int id, int marks)
	{
		StudentDAO studentDAO =new StudentDAO();
		
		Map<Integer,Integer> mapGrade=new LinkedHashMap<Integer,Integer>();
		mapGrade.put(90,100);
		mapGrade.put(80,90);
		mapGrade.put(70,80);
		mapGrade.put(60,70);
		mapGrade.put(40,60);
		mapGrade.put(0,40);
		
        int gid=0;
		for(Map.Entry<Integer,Integer> e:mapGrade.entrySet())
        {
	        gid=gid+1;
        	if(marks>=e.getKey()&&marks<e.getValue())
        	{
        		studentDAO.setGradeValue(id,gid);
        		break;
        	}
        }
		return gid;
		
	}
	
	
	public int statusCalculation(int id, int marks)
	{
		StudentDAO studentDAO =new StudentDAO();
		
		Map<Integer,Integer> mapGrade=new LinkedHashMap<Integer,Integer>();
		mapGrade.put(40,100);
		mapGrade.put(0,40);
		
        int sid=0;
		for(Map.Entry<Integer,Integer> e:mapGrade.entrySet())
        {
	        sid=sid+1;
        	if(marks>=e.getKey()&&marks<e.getValue())
        	{
        		studentDAO.setStatusValue(id,sid);
        		break;
        	}
       }
		return sid;
	}
	

}
