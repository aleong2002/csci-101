
public class TotalRain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// rain, temp, humidity
		double[][] weather = {{2.7, 40.0, 23.0},
				{3.1, 43.0, 25.0},
				{3.4, 48.0, 29.0},
				{4.2, 53.0, 36.0},
				{4.0, 64.0, 42.0},
				{4.2, 68.0, 38.0},
				{2.5, 75.0, 34.0},
				{2.3, 82.0, 43.0},
				{2.7, 73.0, 38.0},
				{2.6, 60.0, 32.0},
				{2.3, 55.0, 31.0},
				{3.1, 32.0, 26.0},
				};
		String[] months = {"January", "February", "March", "April",
				"May", "June", "July", "August", "September",
				"October", "November", "December"};
				
		double sum = 0;
		for (int i = 0; i < 12; i++) {
			sum += weather[i][1];
		}
		System.out.println("The average temperature for the year is " + sum/12 + " F");
	}

}
