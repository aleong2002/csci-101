package midterm2.java;

public class Chameleon extends Animal {
	private String name;
	private int age;
	
	public Chameleon(String name, int age) {
		super(4, "coldblooded", "reptile");
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void changeColor() {
		System.out.println(this.name + " loves camouflage");
	}
	
	@Override
	public void sleep() {
		System.out.println(this.name + " loves sleeping");
	}
	
	public void eat() {
		System.out.println("I love worms");
	}
	
	public static void main(String[] args) {
		Chameleon cham1 = new Chameleon("Pascal", 16);
		System.out.println(cham1.getName() + " is " + cham1.getThermicCondition() + " , has " +
		cham1.getNumLegs() + ", and is a " + cham1.getBreedingType());
		cham1.changeColor();
		cham1.eat();
		cham1.sleep();
				
	}
}
