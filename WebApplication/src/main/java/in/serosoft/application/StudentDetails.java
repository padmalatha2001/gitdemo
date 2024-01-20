package in.serosoft.application;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="batch2022")
public class StudentDetails {

	@Id
	private String regno;
	private String studentname;
	private String programme;
	private String gender;
	private String branch;
	private long govtid;
	private long contactno;
	
	@OneToOne(fetch = FetchType.LAZY)
	private ResultDetails resultdetails;
	
	public StudentDetails() {
		super();
	}

	public StudentDetails(String regno, String studentname, String programme, String gender, String branch, long govtid,
			long contactno, ResultDetails resultdetails) {
		super();
		this.regno = regno;
		this.studentname = studentname;
		this.programme = programme;
		this.gender = gender;
		this.branch = branch;
		this.govtid = govtid;
		this.contactno = contactno;
		this.resultdetails = resultdetails;
	}

	public String getRegno() {
		return regno;
	}

	public void setRegno(String regno) {
		this.regno = regno;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public String getProgramme() {
		return programme;
	}

	public void setProgramme(String programme) {
		this.programme = programme;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public long getGovtid() {
		return govtid;
	}

	public void setGovtid(long govtid) {
		this.govtid = govtid;
	}

	public long getContactno() {
		return contactno;
	}

	public void setContactno(long contactno) {
		this.contactno = contactno;
	}

	public ResultDetails getResultdetails() {
		return resultdetails;
	}

	public void setResultdetails(ResultDetails resultdetails) {
		this.resultdetails = resultdetails;
	}

	@Override
	public String toString() {
		return "StudentDetails [regno=" + regno + ", studentname=" + studentname + ", programme=" + programme
				+ ", gender=" + gender + ", branch=" + branch + ", govtid=" + govtid + ", contactno=" + contactno
				+ ", resultdetails=" + resultdetails + "]";
	}


	
	
	
	
	
	
}
