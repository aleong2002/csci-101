package hi.java;
import java.util.Scanner;

public class CalendarDay {

	public static void main(String[] args) {
		// (Find the number of days in a month) 
		//Write a program that prompts the user to enter
		//the month and year and displays the number of days in the month.
		//For example, if the user entered month 2 and year 2012, 
		// the program should display that February
		// 2012 has 29 days. If the user entered month 3 and year 2015, 
		// the program should display that March 2015 has 31 days.
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a month and a year: ");
		int month = input.nextInt(), year = input.nextInt();
		
		input.close();
		
		int leap = 0;
		
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					leap = 1;
				}
				else {
					leap = 0;
				}
			}
			else {
				leap = 1;
			}
		}
		else {
			leap = 0;
		}
		
		switch (leap) {
		case 0: 
			switch(month) {
				case 1: System.out.println("January had 31 days in " + year); break;
				case 2: System.out.println("February had 28 days in " + year); break;
				case 3: System.out.println("March had 31 days in " + year); break;
				case 4: System.out.println("April had 30 days in " + year); break;
				case 5: System.out.println("May had 31 days in " + year); break;
				case 6: System.out.println("June had 30 days in " + year); break;
				case 7: System.out.println("July had 31 days in " + year); break;
				case 8: System.out.println("August had 31 days in " + year); break;
				case 9: System.out.println("September had 30 days in " + year); break;
				case 10: System.out.println("October had 31 days in " + year); break;
				case 11: System.out.println("November had 30 days in " + year); break;
				case 12: System.out.println("December had 31 days in " + year); break;
			}
			break;
		case 1:
			switch(month) {
			case 1: System.out.println("January had 31 days in " + year); break;
			case 2: System.out.println("February had 29 days in " + year); break;
			case 3: System.out.println("March had 31 days in " + year); break;
			case 4: System.out.println("April had 30 days in " + year); break;
			case 5: System.out.println("May had 31 days in " + year); break;
			case 6: System.out.println("June had 30 days in " + year); break;
			case 7: System.out.println("July had 31 days in " + year); break;
			case 8: System.out.println("August had 31 days in " + year); break;
			case 9: System.out.println("September had 30 days in " + year); break;
			case 10: System.out.println("October had 31 days in " + year); break;
			case 11: System.out.println("November had 30 days in " + year); break;
			case 12: System.out.println("December had 31 days in " + year); break;
			}
		}
	}

}
