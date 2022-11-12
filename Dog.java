package midterm2.java;

public class Dog {

	private String DogName;
	private String Breed;
	private int    Age;
	private static int numDogs = 0;
			
	public static int getNumDogs() {
		return numDogs;
	}
	
	public void setDogName(String DogName) {
		this.DogName = DogName;
	}
	
	public String getDogName() {
		return DogName;
	}
	
	public void setBreed(String Breed) {
		this.Breed = Breed;
	}
	
	public String getBreed() {
		return Breed;
	}
	
	public void setAge(int Age) {
		if (Age > 0 && this.Age < 15) this.Age = Age;
	}
	
	public int getAge() {
		return Age;
	}
	
	public Dog(String DogName, String Breed, int Age) {
		this.DogName = DogName;
		this.Breed   = Breed;
		this.Age     = Age;
		Dog.numDogs++;
	}
	
	
	public void bark() {
		System.out.printf( "%s says, 'Woof!' ", this.DogName);
	}
	
	public String toString() {
		return "Dog " + Dog.getNumDogs();
	}
	
	public boolean equal(Dog dog1) {
		boolean samename = this.DogName.equals(dog1.getDogName());
		boolean sameage = this.Age == dog1.getAge();
		boolean samebreed = ( this.Breed.equals( dog1.getBreed() ) );

		if (samename && sameage && samebreed) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		String[] names = "Patch,Lucky,Cadpig,Roly Poly,Penny,Freckles,Pepper".split(",");
		int[] ages = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
		Dog[] dogs = new Dog[101];
		
		for(int i = 0; i < dogs.length; i++) {
			String randomname = names[(int) (Math.random() * names.length)];
			int randomage = ages[(int) (Math.random() * ages.length)];
			
			dogs[i] = new Dog(randomname, "Dalmation", randomage);
			System.out.println(dogs[i].toString());
			dogs[i].bark();
			System.out.printf( "There exist %d dogs in our world.\n", Dog.getNumDogs());		

			
		}
		
	}
}
