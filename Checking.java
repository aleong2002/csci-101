package midterm2.java;

public class Checking extends Account {
	public Checking(int number, double balance, double rate, String date) {
		super(number, balance, rate, date);
	}
	
	public static void main(String[] args) {
		Checking c = new Checking(1, 1000, 1, "hi");
		c.toString(c);
	}
}
