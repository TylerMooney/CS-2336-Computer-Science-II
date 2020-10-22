/* Author: Tyler Mooney
 * Date: October 11th, 2020
 * Professor: Khan
 * 
 * Purpose: Creates an Account object, sets the annual interest rate,
 * then withdraws, then deposits, then prints out the balance, 
 * monthly interest rate, and the date at which the account was created
 * 
 * Notes:
 */

public class AccountTest 
{
	public static void main(String[] args) 
	{
		// Creating Account object
		Account account1 = new Account(1122,20000);
		
		// Setting annualInterestRate
		account1.setAnnualInterestRate(4.5);

		// Using withdraw method
		account1.withdraw(2500);
		
		// Using deposit method
		account1.deposit(3000);
		
		System.out.printf("The balance of account1: %s\n", account1.getBalance());
		System.out.printf("The monthly interest rate of account1: %s%%\n", account1.getMonthlyInterestRate() * 100);
		System.out.printf("The date account1 was created: %s\n", account1.getDateCreated().toString());
	}
}
