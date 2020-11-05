/* Author: Tyler Mooney
 * Date: October 28th, 2020
 * Professor: Khan
 * 
 * Purpose: Prompt user for a decimal value,
 * then convert and display the binary value
 * of the decimal.
 * 
 * Notes:
 * dec2Bin has to be recursive
 */

import java.util.*;

public class Q18_21
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		//Prompt user for decimal value
		System.out.print("Enter a decimal value: ");
		int value = input.nextInt();
		
		//Call the dec2Bin method, then print results
		System.out.printf("The binary value of %d is %s", value, dec2Bin(value));
		
		input.close();
	}
	
	// Converts a decimal value into binary
	public static String dec2Bin(int value)
	{
		if(value == 0) // Base Case
			return "0";
		if(value == 1) // Base Case
			return "1";
		
		
		/* Old code
		// Calculating the power of 2
		int i = 0, value2 = value;
		while(value2 > 0)
		{
			value2 /= 2;
			i++;
		}
		
		// debugging
		System.out.println("value/2: " + value/2 + " i: " + (i - 1));
		System.out.println("Conditional check: " + (value - (int) Math.pow(2, i - 1)));
		*/
		
		// Determining if remainder is 0 or 1, then calling dec2Bin
		if(value % 2 == 1)
			return  ((dec2Bin(value / 2)) + "1");
		else
			return ((dec2Bin(value / 2)) + "0");
	}
}
