package SuppPractice;
import java.util.*;
/* Write a program that prompts the user to enter ten numbers, and
displays the mean and standard deviations of these numbers */

public class Num5 {
	public static double mean(double[] nums) {
		double mean = 0;
		
		for (int i = 0; i < nums.length; i++) {
			mean += nums[i];
		}
		
		return mean / nums.length;
	}
	
	public static double stDev(double[] nums) {
		double sum = 0;
		for (int i = 0; i < nums.length; i++) {
			double dis = Math.pow (nums[i] - mean(nums), 2);
			sum += dis;
		}
		
		return Math.sqrt(sum/nums.length);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double[] nums = new double[10];
		try {
			for (int i = 0; i < 10; i++) {
				nums[i] = input.nextDouble();
			}
			System.out.println("Mean: " + mean(nums));
			System.out.print("St Dev: " + stDev(nums));
		}
		catch (InputMismatchException x) {
			System.out.println("Not a valid number");
		}
		
		
	}
}
