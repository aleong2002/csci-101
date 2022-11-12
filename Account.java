package midterm2.java;

public class Account {
	public int number;
	public double balance;
	public double rate;
	public String date;
	
	public Account(int number, double balance, double rate, String date) {
		this.number = number;
		this.balance = balance;
		this.rate = rate;
		this.date = date;
	}
	
	public void setNum(int number) {
		this.number = number;
	}
	
	public int getNum() {
		return this.number;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getRate() {
		return this.rate;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public String getDate() {
		return this.date;
	}
	

	
	public void withdraw(double money) {
		 setBalance(balance -= money);
		 System.out.println("Money withdrawn");
	}
	
	public void deposit(double money) {
		setBalance( balance += money);
		System.out.println("Money deposited");
	}
	
	public void toString(Account a) {
		System.out.println("Account " + a.getNum() + " has a balance of " + a.getBalance());
	}
}
