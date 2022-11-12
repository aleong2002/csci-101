package midterm2.java;

public class Human extends Monkey implements BasicHuman {
	public Human() {
		super();
	}
	
	
	public void eat() {
		System.out.println("Eating.");
	}
	@Override
	public void sleep() {
		System.out.println("Sleeping");
	}
	
	public static void main(String[] args) {
		Monkey x = new Human();
		x.jump();
		x.bite();
		
		Human y = new Human();
		y.eat();
		y.sleep();
	}
}
