import java.util.Arrays;

public class Employee implements Comparable<Employee>{
	protected String name;
	protected int rating;
	protected int salary;
	
	
	public Employee() {
		
	}
	
	public Employee (String name, int rating, int salary) {
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
	public int compareTo(Employee e) {
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
		Employee[] x = new Employee []{new Employee("Jeno", 15, 100), new Employee("Chenle", 20, 200), 
				new Employee("Jisung", 10, 300), new Employee("Mark", 15, 170)};
		Arrays.sort(x);
		for (int i = x.length - 1; i >= 0; i--) {
			System.out.println(x[i].toString());

		}
		
	}
	
}
