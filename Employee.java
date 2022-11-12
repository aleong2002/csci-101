package midterm2.java;

public class Employee extends Personn {
	private String office;
	private int salary;
	
	public Employee(String name, String address, int phone, String email, String office, int salary) {
		super(name, address, phone, email);
		this.office = office;
		this.salary = salary;
	}
	
	public void setOffice(String office) {
		this.office = office;
	}
	
	public String getOffice() {
		return this.office;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public void toString(Employee e1) {
		 System.out.println("Employee " + e1.getName());
	}
	
}
