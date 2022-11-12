package midterm2.java;

public class Sub2 extends Parent{
	@Override
	public void message() {
		System.out.println("This is the second subclass");
	}
	
	public static void main(String[] args) {
		Parent x = new Sub1();
		
		Parent y = new Sub2();
		
		y.message();
		x.message();
	}
}
