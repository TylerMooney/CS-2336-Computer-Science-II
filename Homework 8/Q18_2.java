/* Author: Tyler Mooney
 * Date: October 28th, 2020
 * Professor: Khan
 * 
 * Purpose: Rewrite the fib method in Listing 18.2 using
 * iterations. When running the program, prompt the user to enter
 * an index and displays its Fibonacci number.
 * 
 * Notes:
 * Base of the fib method taken from Listing 18.2 in the textbook
 * To computer fib(n) without recursion, you need to obtain
 * fib(n - 2) and fib(n - 1) first. let f0 and f1 denote the two
 * previous Fibonacci
 */

import java.util.*;

public class Q18_2 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		//Prompt user for index and acquire it
		System.out.print("Please enter an integer index: ");
		int index = input.nextInt();
		
		// Calling the fib() method and printing out results
		System.out.printf("The Fibonacci number at index %d is %d\n", index, fib(index));
		
		input.close();
	}
	
	/** The method for finding the Fibonacci number, but it cannot be recursive */
	public static long fib(int n)
	{
		if(n == 0) // base case
			return 0;
		else if(n == 1) // base case
			return 1;
		else // Reduction and recursive calls
		{
			int currentFib = 0;
			int f0 = 0; // For Fib(0)
			int f1 = 1; // For Fib(1)
		
			// I changed the <= to < because it gives the correct output
			for(int i = 1; i < n; i++)
			{
				currentFib = f0 + f1;
				f0 = f1;
				f1 = currentFib;
			}
		
			return currentFib;
		}
	}
}
