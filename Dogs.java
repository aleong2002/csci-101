package midterm2.java;

public class Dogs extends Animal{
	
	private String name;
	private String breed;
	
	public Dogs(String name, String breed) {
		super(4, "warm-blooded", "mammal");
		this.name = name;
		this.breed = breed;
		
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public String getBreed() {
		return this.breed;
	}
	
	public void bark() {
		System.out.println(this.name + " is barking");
	}
	
	public void run() {
		System.out.println(this.name + " is running");
	}
	
	public void eat() {
		System.out.println(this.name + " is eating");
	}
	

}
	
	/*
	private String name;
	private String breed;
	
	public Dogs(String name, String breed) {
		super(4, "warmblooded", "mammal");
		this.name = name;
		this.breed = breed;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public String getBreed() {
		return this.breed;
	}
	
	public void bark() {
		System.out.println(this.name + " is barking");
	}
	
	public void run() {
		System.out.println(this.name + " is running");
	}
	
	public void eat() {
		System.out.println(this.name + " is eating");
	}
	public void sleep() {
		System.out.println(this.name + " is dognapping");
	}
	
	public static void main(String[] args) {
		Dogs dog1 = new Dogs("Jeno", "Samoyed");
		System.out.println(dog1.getName() + " is " + dog1.getThermicCondition() + " , has " +
		dog1.getNumLegs() + ", and is a " + dog1.getBreedingType());
		dog1.bark();
		dog1.eat();
		dog1.sleep();
		dog1.run();
		
	}
} */
