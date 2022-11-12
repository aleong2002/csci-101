
public class SumS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%-10s", "I");
		System.out.println("m(i)");
		
		for (int i = 1; i < 21; i++) {
			System.out.printf("%-10s", i);
			System.out.printf("%2.4f",sumSeries(i));
			System.out.println();
		}
		
	}
	public static double sumSeries(double num1) {
		double sum = 0;
		for (double i = 0; i <= num1; i++) {
			double x = i / (i + 2);
			sum += x;
		}
		return sum;
	}
}
