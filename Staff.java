package midterm2.java;

public class Staff extends Employee {
	private String title;
	
	public Staff(String name, String address, int phone, String email, String office, int salary, String title) {
		super(name, address, phone, email, office, salary);
		this.title = title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void toString(Staff s1) {
		System.out.println("Staff " + s1.getName());
	}
}
