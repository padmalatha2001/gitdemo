package hibernatesample;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="student")
public class Student {
	@Id
   private int sid;
	
    private String sname;
    private char gender;
   private String department;
   private double percentage;
   public Student()
   {
	   
   }
	
    public int getSid() {
	return sid;
}

public void setSid(int sid) {
	this.sid = sid;
}

public String getSname() {
	return sname;
}

public void setSname(String sname) {
	this.sname = sname;
}

public char getGender() {
	return gender;
}

public void setGender(char gender) {
	this.gender = gender;
}

public String getDepartment() {
	return department;
}

public void setDepartment(String department) {
	this.department = department;
}

public double getPercentage() {
	return percentage;
}

public void setPercentage(double percentage) {
	this.percentage = percentage;
}

	@Override
public String toString() {
	return "Student [sid=" + sid + ", sname=" + sname + ", gender=" + gender + ", department=" + department
			+ ", percentage=" + percentage + "]";
}

	public Student(int sid, String sname, char gender, String department, double percentage) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.gender = gender;
		this.department = department;
		this.percentage = percentage;
	}
    
}
