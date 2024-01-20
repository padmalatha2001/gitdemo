package in.practice.service;

import java.util.LinkedHashMap;
import java.util.Map;

import in.practice.dao.StudentDAO;

public class StudentService1 {

	public int gradeCalculation(int id,int marks)
	{
		Map<Integer,Integer> lhm=new LinkedHashMap<Integer,Integer>();
		lhm.put(90, 100);
		lhm.put(80, 90);
		lhm.put(70, 80);
		lhm.put(60, 70);
		lhm.put(40, 60);
		lhm.put(0, 40);
		
		int gid=0;
		for(Map.Entry<Integer, Integer> e:lhm.entrySet())
		{
			gid=gid+1;
			if(marks>=e.getKey()&&marks<=e.getValue())
			{
			  StudentDAO.setGradeValue(id, gid);  
			  break;
			}
		}
		return gid;
	}
	
	public int statusCalculation(int id,int marks)
	{

		
		/*Map<Integer,Integer> mapGrade=new LinkedHashMap<Integer,Integer>();
		mapGrade.put(40,100);
		mapGrade.put(0,40);
		
        int sid=0;
		for(Map.Entry<Integer,Integer> e:mapGrade.entrySet())
        {
	        sid=sid+1;
        	if(marks>=e.getKey()&&marks<e.getValue())
        	{
        		StudentDAO.setStatusValue(id,sid);
        		break;
        	}
       }
		return sid;
		*/
		int sid=0;
		if(marks>=40)
		{
			sid=1;
			StudentDAO.setStatusValue(id,1);
		}
		else
		{
			sid=2;
			StudentDAO.setStatusValue(id,2);
		}
		return sid;
	}
}
