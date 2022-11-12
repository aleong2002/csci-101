package midterm2.java;

public class Student extends Personn {
	private  String GRADE;
	
	public Student(String name, String address, int phone, String email, String GRADE) {
		super(name, address, phone, email);
		this.GRADE = GRADE;
	}
	
	public void setGrade(String GRADE) {
		this.GRADE = GRADE;
	}
	
	public String getGrade() {
		return this.GRADE;
	}
	
	public void toString(Student s1) {
		System.out.println("Student " + s1.getName());
	}
}
