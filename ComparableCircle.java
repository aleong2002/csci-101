package midterm2.java;

public class ComparableCircle extends Circle implements Comparable {
	public ComparableCircle() {
		
	}
	
	public ComparableCircle(double radius) {
		super(radius);
	}
	
	public ComparableCircle(double radius, String color, boolean filled) {
		super(radius, color, filled);
	}
	
	public int compareTo(ComparableCircle o) {
		if (getArea() > o.getArea()) {
			return 1;
		}
		else if (getArea() < o.getArea()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nArea: " + getArea();
	}
	
	public static void main(String[] args) {
		ComparableCircle c1 = new ComparableCircle(12.5);
		ComparableCircle c2 = new ComparableCircle(8);
		System.out.println((c1.compareTo(c2) == 1 ? "ComparableCircle 1 " : "ComparableCircle 2 ") + "is the larger of the two Circles");
	}
}
