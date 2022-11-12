
public class SumSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		for (double i = 1; i < 99; i++) {
			if (i %2 != 0) {
				double num = (i / (i+2));
				sum += num;
			}
		}
		System.out.print(sum);
	}

}
