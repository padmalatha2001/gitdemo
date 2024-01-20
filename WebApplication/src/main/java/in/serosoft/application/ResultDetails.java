package in.serosoft.application;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="results2022")
public class ResultDetails {
	
	
	@Id
	private int regno;
	private String maths1;
	private String maths2;
	private String datastructures;
	private String operatingsystems;
	private String personalitydevelopment;
	private String sgpa;
	private String cgpa;
	private String resultstatus;
	
	@OneToOne(mappedBy = "resultdetails")
	private StudentDetails studentdetails;
	
	
	public ResultDetails(int regno, String maths1, String maths2, String datastructures, String operatingsystems,
			String personalitydevelopment, String sgpa, String cgpa,String resultstatus) {
		super();
		this.regno = regno;
		this.maths1 = maths1;
		this.maths2 = maths2;
		this.datastructures = datastructures;
		this.operatingsystems = operatingsystems;
		this.personalitydevelopment = personalitydevelopment;
		this.sgpa = sgpa;
		this.cgpa = cgpa;
		this.resultstatus=resultstatus;
	}
	
	
	public ResultDetails(int regno) {
		super();
		this.regno = regno;
	}


	public ResultDetails() {
		super();
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getMaths1() {
		return maths1;
	}
	public void setMaths1(String maths1) {
		this.maths1 = maths1;
	}
	public String getMaths2() {
		return maths2;
	}
	public void setMaths2(String maths2) {
		this.maths2 = maths2;
	}
	public String getDatastructures() {
		return datastructures;
	}
	public void setDatastructures(String datastructures) {
		this.datastructures = datastructures;
	}
	public String getOperatingsystems() {
		return operatingsystems;
	}
	public void setOperatingsystems(String operatingsystems) {
		this.operatingsystems = operatingsystems;
	}
	public String getPersonalitydevelopment() {
		return personalitydevelopment;
	}
	public void setPersonalitydevelopment(String personalitydevelopment) {
		this.personalitydevelopment = personalitydevelopment;
	}
	public String getSgpa() {
		return sgpa;
	}
	public void setSgpa(String sgpa) {
		this.sgpa = sgpa;
	}
	public String getCgpa() {
		return cgpa;
	}
	public void setCgpa(String cgpa) {
		this.cgpa = cgpa;
	}
	
	
	public StudentDetails getStudentdetails() {
		return studentdetails;
	}

	
	
	public String getResultstatus() {
		return resultstatus;
	}	


	public void setResultstatus(String resultstatus) {
		this.resultstatus = resultstatus;
	}


	public void setStudentdetails(StudentDetails studentdetails) {
		this.studentdetails = studentdetails;
	}


//	@Override
//	public String toString() {
//		return "ResultDetails [regno=" + regno + ", maths1=" + maths1 + ", maths2=" + maths2 + ", datastructures="
//				+ datastructures + ", operatingsystems=" + operatingsystems + ", personalitydevelopment="
//				+ personalitydevelopment + ", sgpa=" + sgpa + ", cgpa=" + cgpa + ", resultstatus=" + resultstatus
//				+ ", studentdetails=" + studentdetails + "]";
//	}

	
	
	

}
