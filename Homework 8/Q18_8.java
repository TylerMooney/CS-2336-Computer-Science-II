/* Author: Tyler Mooney
 * Date: October 28th, 2020
 * Professor: Khan
 * 
 * Purpose: Prompt user to enter an integer, then
 * display the reverse order of that value
 * 
 * Notes:
 * reverseDisplay has a recursive method
 */

import java.util.*;

public class Q18_8 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		// Prompt user for integer value
		System.out.print("Enter an Integer Value: ");
		int value = input.nextInt();
		
		//Calling method and displaying results
		System.out.print("Reverse order of value: ");
		reverseDisplay(value);
		
		input.close();
	}
	
	// Recursive Method that displays an int value reversely
	public static void reverseDisplay(int value)
	{
		int length = (int) (Math.log10(value) + 1);
		if(length == 1) // Base Case
			System.out.print(value);
		else
		{
			// Calling method with the first value of the digit removed
			reverseDisplay((int) (value % Math.pow(10, (int) Math.log10(value))));
			
			// Printing out first digit of the value
			System.out.print((int) (value %  Math.pow(10, length)/ Math.pow(10, length - 1)));
		}
	}
}
