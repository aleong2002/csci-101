import java.util.Arrays;
import java.util.Scanner;

public class RunningSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length and values of the array: ");
		int length = input.nextInt();
		
		if (length <= 0) {
			System.out.println("Invalid input");
		}
		
		else {
			int[] nums = new int[length];
			for (int i = 0; i <length; i++) {
				nums[i] = input.nextInt();
			}
			System.out.print("The running sum is: " + Arrays.toString(runningSum(nums)));
		}
		
	}
	public static int[] runningSum(int[] nums) {
		int sum = 0;
		int[] rsums = new int[nums.length];
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
			rsums[i] = sum;
		}
		return rsums;
	}

}
