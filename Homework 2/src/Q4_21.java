/* Author: Tyler Mooney
 * Date: September 16th, 2020
 * Professor: Khan
 * 
 * Purpose: Prompt user to input a SSN number,
 * then check if the SSN number inputed is valid
 * 
 * Notes:
 * You can't use loops
 * The format of the SSN is DDD-DD-DDDD (D is a digit)
 * See if you can use isDigit
 * I checked what was used in chapter 4 and before in the textbook
 * Use a bool to determine what to print
 */

import java.util.*;
import java.lang.Character;

public class Q4_21 {
	public static void main(String [] args)
	{	
		//Initialize Scanner and variables
		Scanner input = new Scanner(System.in);
		String SSN;
		boolean isValid = true;
		
		//prompt user for SSN and acquire it
		System.out.print("Enter a SSN: ");
		SSN = input.next();
		
		//Checking if the SSN is valid
		//Checking if the SSN is the incorrect length
		if(SSN.length() != 11) 
			isValid = false;
		else
		{
			// Checking if hyphens are not in the correct place
			if(SSN.charAt(3) != '-' || SSN.charAt(6) != '-') 
				isValid = false;

			//Checking if the first three characters are not digits
			if(!Character.isDigit(SSN.charAt(0)) || !Character.isDigit(SSN.charAt(1)) || !Character.isDigit(SSN.charAt(2)))
				isValid = false;

			//Checking if the middle two characters are not digits
			if(!Character.isDigit(SSN.charAt(4)) || !Character.isDigit(SSN.charAt(5)))
				isValid = false;

			//Checking if the last 4 characters are not digits else the SSN is valid
			if(!Character.isDigit(SSN.charAt(7)) || !Character.isDigit(SSN.charAt(8)) || !Character.isDigit(SSN.charAt(9)) || !Character.isDigit(SSN.charAt(10)))
				isValid = false;
		}

		//Printing out results
		if(isValid)
			System.out.printf("%s is a valid social security number", SSN);
		else
			System.out.printf("%s is an invalid social security number", SSN);
		
		input.close();
	}
}