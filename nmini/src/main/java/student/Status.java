package student;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="status")
public class Status {
	@Id
	private int Id;
	
	public Status() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String status;

	public Status(int id, String status) {
		super();
		Id = id;
		this.status = status;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Status [Id=" + Id + ", status=" + status + "]";
	}
	

}
