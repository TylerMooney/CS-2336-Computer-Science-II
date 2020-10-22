/* Author: Tyler Mooney
 * Date: September 16th, 2020
 * Professor: Khan
 * 
 * Purpose: Prompt the user to enter in a year and a date,
 * then print out the input and the amount of days in that month
 * 
 * Notes:
 * You can't use loops
 * Use the calculation for a leap year from 3.11 in the textbook
 */

import java.util.*;

public class Q4_17 {
	public static void main(String [] args)
	{
		//Initialization of Scanner and variables
		Scanner input = new Scanner(System.in);
		int year = 0;
		String month = "";
		
		//Prompt user for year and month and acquire them
		System.out.print("Enter a year: ");
		year = input.nextInt();
		System.out.print("Enter a month: ");
		month = input.next();
		
		//Printing out results
		if(month.equals("Jan"))
			System.out.printf("%s %d has %d days\n", month, year, 31);
		else if(month.equals("Feb"))
		{
			//Determining if the year is a leap year
			if(year % 4 == 0 && year % 100 != 0)
				System.out.printf("%s %d has %d days\n", month, year, 29);
			else
				System.out.printf("%s %d has %d days\n", month, year, 28);
		}
		else if(month.equals("Mar"))
			System.out.printf("%s %d has %d days\n", month, year, 31);
		else if(month.equals("Apr"))
			System.out.printf("%s %d has %d days\n", month, year, 30);
		else if(month.equals("May"))
			System.out.printf("%s %d has %d days\n", month, year, 31);
		else if(month.equals("Jun"))
			System.out.printf("%s %d has %d days\n", month, year, 30);
		else if(month.equals("Jul"))
			System.out.printf("%s %d has %d days\n", month, year, 31);
		else if(month.equals("Aug"))
			System.out.printf("%s %d has %d days\n", month, year, 31);
		else if(month.equals("Sep"))
			System.out.printf("%s %d has %d days\n", month, year, 30);
		else if(month.equals("Oct"))
			System.out.printf("%s %d has %d days\n", month, year, 31);
		else if(month.equals("Nov"))
			System.out.printf("%s %d has %d days\n", month, year, 30);
		else
			System.out.printf("%s %d has %d days\n", month, year, 31);
		
		input.close();
	}
	
}
