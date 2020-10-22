/* Author: Tyler Mooney
 * Date: September 23st, 2020
 * Professor: Khan
 * 
 * Purpose: Prompt the user to enter 10 numbers,
 * fill an array with the numbers, then determine
 * what numbers are distinct and print out results.
 * 
 * Notes:
 * Have it to where you check whether the number in list
 * is equal to any number in the distinct array, if not
 * then add that value to the next open space in the array
 * This would probably be easier if you could use ArrayLists and .Size
 * Wasn't sure if I should be able to read in Zeroes as a valid entry,
 * So I just didn't allow for it because I can't think of a way to 
 * get zeros to be read and still allow for the array to go through properly
 * without a global counter, or by editing the required method to take in a counter.
 */

import java.util.*;

public class Q7_15 {
	public static void main(String[] args) {
		//Variable, Array, and Scanner initialization
		Scanner input = new Scanner(System.in);
		int[] numbersArray = new int[10];
		int[] distinctArray;
		
		//Prompting user and acquiring values
		System.out.print("Enter ten numbers: ");
		for(int i = 0; i < numbersArray.length; i++)
			numbersArray[i] = input.nextInt();

		//Calling method to acquire array full of distinct numbers
		distinctArray = eliminateDuplicate(numbersArray);
		
		//Printing out results
		System.out.print("The distinct numbers are: ");
		
		//Printing out the distinct values
		//We don't print the value zero because it is the value of uninitialized array elements
		for(int i = 0; i < distinctArray.length; i++)
			if(distinctArray[i] != 0)
				System.out.printf("%d ", distinctArray[i]);
		
		input.close();
	}
	
	public static int[] eliminateDuplicate(int[] list)
	{
		//We set this array to the length of the other array, because that will be
		//the max amount of distinct numbers possible
		int[] distinctArray = new int[list.length];
		distinctArray[0] = list[0];
		int counter = 1; //Counter is used to fill in the next empty space of distinctArray
		int notEqualCount = 0;
		
		for(int i = 1; i < list.length; i++)
		{
			//Checking if there are any occurrences of a duplicate
			for(int j = 0; j < distinctArray.length; j++)
			{
				if(distinctArray[j] == list[i])
					continue;
				else
					notEqualCount++;
			}
			
			//Determines if there wasn't any duplicates, based on occurrences
			//This is to take into account that there are zeroes in the uninitialized array elements
			if((notEqualCount - counter) == distinctArray.length - counter)
			{
				distinctArray[counter] = list[i];
				counter++;
			}
			notEqualCount = 0;
		}
		
		return distinctArray;
	}

}
