package college;

public class TestCollege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        College clg=(College)Department.getCollege();
        clg.addStudent();
        clg.deleteStudent();
        clg.selectStudent();
        clg.updateStudent();
	}

}
