package in.project.model;

public class StudentModel {
	
private long id;
	
	private String name;
	private int age;
	private String stream;
	private String branch;
	private double cgpa;
	private double sgpa;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getCgpa() {
		return cgpa;
	}
	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	public double getSgpa() {
		return sgpa;
	}
	public void setSgpa(double sgpa) {
		this.sgpa = sgpa;
	}
	
	
	@Override
	public String toString() {
		return "StudentModel [id=" + id + ", name=" + name + ", age=" + age + ", stream=" + stream + ", branch="
				+ branch + ", cgpa=" + cgpa + ", sgpa=" + sgpa + "]";
	}
	
	

}
