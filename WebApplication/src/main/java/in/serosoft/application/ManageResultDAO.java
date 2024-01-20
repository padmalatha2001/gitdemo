package in.serosoft.application;

public interface ManageResultDAO {
	
	public StudentDetails findById(String regNo);
	public StudentDetails findByName(String name);

}
