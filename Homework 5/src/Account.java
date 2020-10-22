/* Author: Tyler Mooney
 * Date: October 7th, 2020
 * Professor: Khan
 * Referenced Libraries: None
 * 
 * Purpose: A basic Class meant to
 * be used in a test program
 * 
 * Notes:
 * TODO redo the purpose comment
 * TODO create test program for this class
 */

import java.util.Date;

public class Account 
{
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0; // Assume all accounts have the same interest rate
	private Date dateCreated = new Date(); //TODO figure out how to set this to the current date
	
	// Default Constructor
	public Account()
	{
		
	}
	
	// Constructor
	public Account(int x, double y)
	{
		id = x;
		balance = y;
	}
	
	// Accesor methods that return specified data fields
	void setID(int x)
	{
		id = x;
	}
		
	void setBalance(double x)
	{
		balance = x;
	}
		
	void setAnnualInterestRate(double x)
	{
		annualInterestRate = x;
	}
	
	// Accesor methods that return specified data fields
	int getID()
	{
		return id;
	}
	
	double getBalance()
	{
		return balance;
	}
	
	double getAnnualInterestRate()
	{
		return annualInterestRate;
	}
	
	Date getDateCreated()
	{
		return dateCreated;
	}
	
	// Get methods that return values???
	double getMonthlyInterestRate()
	{
		return (annualInterestRate / 100) / 12;
	}
	
	double getMonthlyInterest()
	{
		double monthlyInterestRate = getMonthlyInterestRate();
		return balance * monthlyInterestRate;
	}
	
	// Methods that change balance
	void withdraw(double x)
	{
		balance -= x;
	}
	
	void deposit(double x)
	{
		balance += x;
	}
}
