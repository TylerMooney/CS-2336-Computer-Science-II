/* Author: Tyler Mooney
 * Date: September 21st, 2020
 * Professor: Khan
 * 
 * Purpose: Have the user enter in the array length,
 * then type in values to fill in the array.
 * Then check if the array is already sorted from low to high.
 * 
 * Notes:
 * 
 */

import java.util.*;

public class Q7_19 {
	public static void main(String[] args) {
		//Variable and Scanner initialization
		Scanner input = new Scanner(System.in);
		boolean isSorted = true;
		
		//Prompt user and acquire array length and values
		System.out.print("Enter list: ");
		int[] list = new int[input.nextInt()];
		for(int i = 0; i < list.length; i++)
			list[i] = input.nextInt();
		
		//Calling the method
		isSorted = isSorted(list);
		
		//Printing out result
		if(isSorted)
			System.out.println("The list is already sorted");
		else
			System.out.println("The list is not sorted");
		
		input.close();
	}
	
	//Checking if the list is sorted
	public static boolean isSorted(int[] list)
	{
		int value = list[0];
		
		//Checks to see if the previous value is larger than the current value
		//If so the list isn't sorted
		for(int i = 1; i < list.length; i++)
			if(value > list[i])
				return false;
			else
				value = list[i];

		
		return true;
	}
}
