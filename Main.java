package midterm2.java;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A aObj = new A();
		System.out.println( aObj.getMessage() );
		B bObj = new B();
		System.out.println( bObj.getMessage() );
		C cObj = new C( "Welcome!!" );
		System.out.println( cObj.getMessage() );
	}
}
