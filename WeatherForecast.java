
public class WeatherForecast {

	public static void main(String[] args) {
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
		double max = 0;
		int index = 0;
		
		for (int i = 0; i < 12; i++) {
			if (weather[i][2] > max) {
				max = weather[i][2];
				index = i;
			}
		}
		System.out.println("The month with the highest humidity is " + months[index]);
		
	}

}
