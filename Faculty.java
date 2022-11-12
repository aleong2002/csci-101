package midterm2.java;

public class Faculty extends Employee {
	private String hours;
	private String rank;
	
	public Faculty(String name, String address, int phone, String office, int salary, String email, String hours, String rank) {
		super(name, address, phone, email, office, salary);
		this.hours = hours;
		this.rank = rank;
	}
	
	public void setHours(String hours) {
		this.hours = hours;
	}
	
	public String getHours() {
		return this.hours;
	}
	
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	public String getRank() {
		return this.rank;
	}
	
	public void toString(Faculty f1) {
		System.out.println("Faculty " + f1.getName());
	}
}
