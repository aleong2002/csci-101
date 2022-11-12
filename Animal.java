package midterm2.java;

public abstract class Animal {
	
	private int numLegs;
	private String thermicCondition;
	private String breedingType;
	
	public abstract void eat();
	
	public void sleep() {
		System.out.println("Good night");
	}
	
	public Animal() {
		this.numLegs = 4;
		this.thermicCondition = "warmblooded";
		this.breedingType = "mammal";
	}
	
	public Animal(int numLegs, String thermicCondition, String breedingType) {
		this.numLegs = numLegs;
		this.thermicCondition = thermicCondition;
		this.breedingType = breedingType;
	}
	
	public void setNumLegs(int numLegs) {
		this.numLegs = numLegs;
	}
	public int getNumLegs() {
		return this.numLegs;
	}
	
	public String getThermicCondition() {
		return this.thermicCondition;
	}
	
	public void setThermicCondition(String thermicCondition) {
		this.thermicCondition = thermicCondition;
	}
	
	public String getBreedingType() {
		return this.breedingType;
	}
	
	public void setBreedingType(String breedingType) {
		this.breedingType = breedingType;
	}
	
}
	/*
	private int numLegs;
	private String thermicCondition;
	private String breedingType;
	
	public Animal() {
		this.numLegs = 4;
		this.thermicCondition = "warmblooded";
		this.breedingType = "mammal";
	}
	
	public Animal(int numLegs, String thermicCondition, String breedingType) {
		this.numLegs = numLegs;
		this.thermicCondition = thermicCondition;
		this.breedingType = breedingType;
	}
	
	public void eat() {
		System.out.println("Hunting time");
	}
	
	public void sleep() {
		System.out.println("Sleeping time");
	}
	
	public void setNumLegs(int numLegs) {
		this.numLegs = numLegs;
	}
	public int getNumLegs() {
		return this.numLegs;
	}
	
	public String getThermicCondition() {
		return this.thermicCondition;
	}
	
	public void setThermicCondition(String thermicCondition) {
		this.thermicCondition = thermicCondition;
	}
	
	public String getBreedingType() {
		return this.breedingType;
	}
	
	public void setBreedingType(String breedingType) {
		this.breedingType = breedingType;
	}
	
	public static void main(String[] args) {
		Dogs jisung = new Dogs("Jisung", "Aussie Shepherd");
		Chameleon jack = new Chameleon("Jack", 3);
		
		if (jisung instanceof Dogs) {
			System.out.println("Jisung is a dog");
		}
		
		if (jack instanceof Chameleon) {
			System.out.println("Jack is a chameleon");
		}
	}
}
*/
