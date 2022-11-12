package midterm2.java;

public class Savings extends Account {
	
	public Savings(int number, double balance, double rate, String date) {
		super(number, balance, rate, date);
	}
	
	public void withdraw(double money) {
		if (money > getBalance()) {
			System.out.println("Cannot withdraw");
		}
		
		else {
			System.out.println("Money withdrawn");
			setBalance(this.balance -= money);
		}
	}
	
	public static void main(String[] args) {
		Savings s = new Savings(1, 1000, 1, "ji");
		s.withdraw(240);
		System.out.println( s.getBalance());
	}
}
