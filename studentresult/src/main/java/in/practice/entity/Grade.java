package in.practice.entity;

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
@Table(name="Grade")
public class Grade {
    @Id
    private int id;
    private String grade;
    
	public Grade() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Grade(int id, String grade) {
		super();
		this.id = id;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Grade [id=" + id + ", grade=" + grade + "]";
	}
   
	
    
}
