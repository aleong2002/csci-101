import java.util.Arrays;

public class EmployeeType implements Comparable<EmployeeType>{
	//extra credit
	protected String name;
	protected int rating;
	protected int salary;
		
		
	public EmployeeType() {
		
	}
		
	public EmployeeType (String name, int rating, int salary) {
		this.name = name;
		this.rating = rating;
		this.salary = salary;
	}
		
	public String getName() {
		return this.name;
	}
		
	public int getRating() {
		return this.rating;
	}
		
	public int getSalary() {
		return this.salary;
	}
		
	@Override
	public int compareTo(EmployeeType e) {
		/* if (this.rating == e.getRating()) {
			return - (this.salary - e.getSalary());
			}
			
			else {
				return - (this.rating - e.getRating());
			} */
			
			
		if (this.rating > e.getRating()) {
			return 1;
		}
		
		else if (this.rating == e.getRating()) {
			if (this.salary == e.getSalary()) {
				return 0;
			}
			else if (this.salary > e.getSalary()) {
				return 1;
			}
				
			else {
				return -1;
			}
		}
		else {
			return -1;
		} 
	}
		
	public String toString() {
		return "Name: " + this.name + " Rating: " + this.rating + " Salary: " + this.salary;
	}
		
	public static void main(String[] args) {
		EmployeeType[] x = new EmployeeType []{new Manager("Jeno", 15, 100), new Engineer("Chenle", 20, 200), 
			new SupportStaff("Jisung", 10, 300), new Manager("Mark", 15, 170)};
		Arrays.sort(x);
		for (int i = x.length - 1; i >= 0; i--) {
			System.out.println(x[i].toString());
		}
		
	}
		
}
class Manager extends EmployeeType {
	public Manager() {
		super();
	}
		
	public Manager(String name, int rating, int salary) {
		super(name, rating, salary);
	}
		
	@Override
	public String toString() {
		return "I am " + this.name + " and I am a Manager";
	}
}

class Engineer extends EmployeeType {
	public Engineer() {
		super();
	}
		
	public Engineer(String name, int rating, int salary) {
		super(name, rating, salary);
	}
		
	@Override
	public String toString() {
		return "I am " + this.name + " and I am a Engineer";
	}
}

class SupportStaff extends EmployeeType {
	public SupportStaff() {
		super();
	}
		
	public SupportStaff(String name, int rating, int salary) {
		super(name, rating, salary);
	}
		
	@Override
	public String toString() {
		return "I am " + this.name + " and I am a Support Staff";
	}
}


