package hi.java;

public class DisplayCurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long totalMilliseconds = System.currentTimeMillis();
		System.out.println(totalMilliseconds);
		
		// total seconds
		long totalSeconds = totalMilliseconds / 1000;
		
		long currentSeconds = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		
		long currentMinutes = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		
		long currentHours = totalHours % 24;
		
		System.out.println("Current time is " + currentHours + ":" + currentMinutes + ":" + currentSeconds + " GMT");
	}

}
