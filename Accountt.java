package midterm2.java;

public class Accountt {
	protected double balance;
	protected String name;
	
	public Accountt() {
		this.name = "Jeno";
		this.balance = 10000;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setName(String name) {
		this.name= name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Accountt(double balance, String name) {
		this.balance = balance;
		this.name = name;
	}
	
	public double deposit(double money) {
		if (money >= 0) {
			setBalance(getBalance() + money);
			return this.balance;
		}
		
		return this.balance;
		
	}
	
	public double withdraw(double money) {
		if( money >=0 && money <= this.balance) {
			setBalance(getBalance() - money);
			return this.balance;
		}
		
		return 0;
	}
	
	public String toString() {
		return String.format("%s has a balance of %.2f$", this.name, this.balance);
	}
}
