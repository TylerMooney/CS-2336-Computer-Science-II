/* Author: Tyler Mooney
 * Date: September 21st, 2020
 * Professor: Khan
 * 
 * Purpose: Prompt the user for a loan amount, number of years,
 * and Annual Interest Rate. Then calculate and print the 
 * Interest, Principal and balance of the loan for each payment,
 * until the Balance is finally paid off.
 * 
 * Notes:
 * Monthly interest is monthly interest rate times the balance
 * Principal is the monthly payment minus the monthly interest
 * Have to fix the program by using left and right justified
 * Check Chapter 4 4.6 in the textbook to see how to edit printf
 * I can't seem to figure out how to add a lot of padding spaces
 */

import java.util.Scanner;

public class Q5_22 {

	public static void main(String[] args) {
		//Variable and Scanner initialization
		double loanAmt = 0, payMonth = 0, annualInterestRate = 0, payTotal = 0, monthlyInterestRate = 0;
		double balance = 0, principal = 0, monthlyInterest = 0;
		int years = 0;
		Scanner input = new Scanner(System.in);
		
		//Prompting user for Loan amount and number of years
		System.out.print("Loan Amount: ");
		loanAmt = input.nextDouble();
		System.out.print("Number of Years: ");
		years = input.nextInt();
		System.out.print("Annual Interest Rate: ");
		annualInterestRate = input.nextDouble();
		
		//Calculating monthlyInterestRate, monthly payment and total payment, then printing out results
		monthlyInterestRate = annualInterestRate / 1200;
		payMonth = loanAmt * monthlyInterestRate / (1 - 1/Math.pow(1 + monthlyInterestRate, years * 12));
		payTotal = payMonth * years * 12;
		balance = loanAmt;
		
		System.out.printf("\nMonthly Payment: %.2f\n", payMonth);
		System.out.printf("Total Payment: %.2f\n\n", payTotal);
		System.out.printf("%-12s%-12s%-12s%13s", "Payment#", "Interest", "Principal", "Balance\n");

		
		//Calculating and printing out Monthly Interest, Principal, and Balance per payment until balance of loan is zero
		for(int payment = 1; balance > principal; payment++)
		{
			monthlyInterest = monthlyInterestRate * balance;
			principal = payMonth - monthlyInterest;
			balance -= principal;
			
			System.out.printf("%-12d%5.2f       %-12.2f%12.2f\n", payment, monthlyInterest, principal, balance);
		}
		
		input.close();
	}


}
