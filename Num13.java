package SuppPractice;
import java.util.*;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;  
/* .Design a class named StopWatch. The class contains:
Private data fields startTime and endTime with get methods.
● A no-arg constructor that initializes startTime with the current time.
● A method named start() that resets the startTime to the current time.
● A method named stop() that sets the endTime to the current time.
● A method named getElapsedTime() that returns the elapsed time for the
stopwatch in milliseconds.
Implement the class. Write a test program that measures the execution time of
sorting 100,000 numbers using selection sort. */

public class Num13 {
	private static long startTime;
	private static long endTime;
	
	public Num13() {
		Num13.startTime = System.currentTimeMillis();
	}
	
	public static long getStartTime() {
		return Num13.startTime;
	}
	
	public static long getEndTime() {
		return Num13.endTime;
	}
	
	public static void start() {
		Num13.startTime = System.currentTimeMillis();
	}
	
	public static void stop() {
		Num13.endTime = System.currentTimeMillis();
	}
	
	public static long getElapsedTime() {
		return  Num13.endTime- Num13.startTime;
		
	}
	
	public static void sort(int[] arr) {
		start();		
		for (int i = 0; i < arr.length - 1; i++) {
			int minid = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[minid] > arr[j]) {
					minid = j;
				}
			int temp = arr[minid];
			arr[minid] = arr[i];
	        arr[i] = temp;
			}
			
		}
		stop();
	}
	
	public static void main(String[] args) {
		int[] arr = new int[100000];
		for (int i = 0; i < 100000; i++) {
			arr[i] = i + 1;
		}
		sort(arr);
		System.out.println(getElapsedTime());
	}
}
