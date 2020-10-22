/* Author: Tyler Mooney
 * Date: September 16th, 2020
 * Professor: Khan
 * 
 * Purpose: Prompt user for an employee's name,
 * number of hours worked in a week, hourly pay rate,
 * federal tax withholding rate, and state tax withholding rate.
 * calculate how much the federal withholding, state withholding,
 * total deduction, and net pay is.
 * Then print out all info acquired and calculated
 * 
 * Notes:
 * You can't use loops
 * How the results should be printed out
 * 		Employee Name: Name
 * 		Hours Worked: #.##
 * 		Pay Rate: $#.##
 * 		Gross Par: $#.##
 * 		Deductions:
 * 		  Federal Withholding (#.##%): $#.##
 * 		  State Withholding (#.##%): $#.##
 * 		  Total Deduction: $#.##
 * You have to use printf and always have 2 decimals places
 * For some reason the %.2f is rounding up the decimals in printing
 */

import java.util.*;

public class Q4_23 {
	public static void main(String [] args)
	{	
		//Initialize Scanner and variables
		Scanner input = new Scanner(System.in);
		double hours, ratePay, rateFed, rateState;
		double grossPay, totalDeduc, fedHold, stateHold, netPay;
		String name;
		
		//Prompt user for variables and acquire them
		System.out.print("Enter employee's name: ");
		name = input.next();
		System.out.print("Enter number of hours worked in a week: ");
		hours = input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		ratePay = input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		rateFed = input.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		rateState = input.nextDouble();
		
		//Calculating Gross pay, all deductions, and Net Pay
		grossPay = hours * ratePay;
		fedHold = grossPay * rateFed;
		stateHold = grossPay * rateState;
		totalDeduc = fedHold + stateHold;
		netPay = grossPay - totalDeduc;
		
		//Printing out results
		System.out.printf("\nEmployee Name: %s\n", name);
		System.out.printf("Hours Worked: %.2f\n", hours);
		System.out.printf("Pay Rate: $%.2f\n", ratePay);
		System.out.printf("Gross Pay: $%.2f\n", grossPay);
		System.out.printf("Deductions: \n");
		System.out.printf("  Federal Withholding (%.2f%s): $%.2f\n", rateFed * 100,'%', fedHold);
		System.out.printf("  State Withholding (%.2f%s): $%.2f\n", rateState * 100,'%', stateHold);
		System.out.printf("  Total Decution: $%.2f\n", totalDeduc);
		System.out.printf("Net Pay: $%.2f", netPay);
		
		input.close();
	}

}
