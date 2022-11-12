
public class PoundKilo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%-15s", "Kilograms");
		System.out.printf("%-16s", "Pounds");
		System.out.println();
		for (int i = 1; i < 200; i++) {
			if (i % 2 != 0) {
				System.out.printf("%-15s", i);
				System.out.printf("%-1s"," ");
				System.out.printf("%2.1f%n",poundToKilogram(i));
			}
		}
		System.out.printf("%-15s", "Kilograms");
		System.out.printf("%-16s", "Pounds");
		System.out.println();
		for (int i = 20; i < 516; i++) {
			if (i % 5 == 0) {
				System.out.printf("%-15s", i);
				System.out.printf("%-1s"," ");
				System.out.printf("%2.2f%n",kilogramToPound(i));
			}
		}
	}
	/** Convert from pounds to kilograms */
	public static double poundToKilogram(double pound) {
		double kg = pound * 2.204;
		return kg;
	}
	/** Convert from kilograms to pounds */
	public static double kilogramToPound(double kilogram) {
		double lb = kilogram * .453;
		return lb;
	}
}
