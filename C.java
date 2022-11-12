package midterm2.java;

public class C extends B {
    // a no-args constructor
    public C() {
      super(); // call B's no-args constructor
    }
    // an overloaded constructor that accepts a message
    public C( String message) {
        super(); // call B's no-args constructor
        System.out.println( "A new C object is born!" );
        /* this.setMessage( message ); */
    }
}