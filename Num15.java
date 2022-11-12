package SuppPractice;
import java.util.*;
/* Implement a class MyStack using inheritance that extends ArrayList. The class
should have following methods:
● public void push(Object entry) : the method should insert an
entry in the stack
● public Object pop() : the method pop should remove and return the
most recently inserted entry in the stack.
● public Object top() : the method top should only return the most
recently inserted entry in the stack.
● public int getSize(): the method getSize should return the current
number of elements in the stack.
● public String toString(): override toString method to print
“MyStack Contains: ” before default string representation of ArrayList.
You cannot assume that top/pop will not be called on an empty Stack.
Raise an exception if such a situation occurs. */

@SuppressWarnings("serial")
public class Num15 extends ArrayList<Num15> {
	protected List<Object> x;
	protected int count;
	
	public Num15 () {
		this.x = new ArrayList<Object>();
		this.count = 0;
	}
	
	
	public void push(Object entry) {
		x.add(entry);
		count++;
	}
	
	public Object pop() {
		if (getSize() == 0) {
			return "Empty stack";
		}
		else {
			Object y = x.get(getSize() -1);
			x.remove(count - 1);
			count--;
			return y;
		}
	}
	
	public Object top() {
		if (getSize() == 0) {
			return "Empty stack";
		}
		else {
			return x.get(getSize() - 1);
		}
	}
	public int getSize() {
		return x.size();
	}
	
	@Override
	public String toString() {
		return "My Stack Contains: " + Arrays.deepToString(x.toArray());
	}
	
	
	
	
	public static void main(String[] args) {
		Num15 s = new Num15();
		s.push(1);
		s.push(2);
		s.push(3);
		System.out.println(s.toString());
		s.pop();
		System.out.println(s.top());
		System.out.println(s.toString());
		}

}
