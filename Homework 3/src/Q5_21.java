/* Author: Tyler Mooney
 * Date: September 21st, 2020
 * Professor: Khan
 * 
 * Purpose: Prompt the user for a loan amount and a number of years
 * Then calculate and print out the Monthly Payments and Total Payments 
 * based on an annual interest rate incrementing from 5% to 8% by 1/8%
 * 
 * Notes:
 * I tried using the interest rate as if it were monthly interest rate
 * but that kept giving me numbers way too high compared to the example
 * So I assume that the interest rate we display is the annual and
 * we must calculate the monthly interest rate ourselves
 * Have to fix the program by using left and right justified
 * Check Chapter 4 4.6 in the textbook to see how to edit printf
 * I can't seem to figure out how to add a lot of padding spaces
 */

import java.util.*;

public class Q5_21 {

	public static void main(String[] args) {
		//Variable and Scanner initialization
		double loanAmt = 0, payMonth = 0, annualInterestRate = 0.05, payTotal = 0, monthlyInterestRate = 0;
		int years = 0;
		Scanner input = new Scanner(System.in);
		
		//Prompting user for Loan amount and number of years
		System.out.print("Loan Amount: ");
		loanAmt = input.nextDouble();
		System.out.print("Number of Years: ");
		years = input.nextInt();
		
		//Printing out header and looping results until interestRate is equal to 8%
		//We use .08125 because the increments cause the interestRate to be just a little above .08
		System.out.println("Interest Rate    Monthly Payment    Total Payment");
		while(annualInterestRate < .08125)
		{
			monthlyInterestRate = annualInterestRate / 12;
			payMonth = loanAmt * monthlyInterestRate / (1 - 1/Math.pow(1 + monthlyInterestRate, years * 12));
			payTotal = payMonth * years * 12;
			
			System.out.printf("%.3f%%           %-19.2f%.2f\n", annualInterestRate * 100, payMonth, payTotal);
			
			annualInterestRate += .00125; //Incrementing the percent by 1/8%
		}
		
		input.close();
	}

}
