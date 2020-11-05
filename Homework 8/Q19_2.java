/* Author: Tyler Mooney
 * Date: October 28th, 2020
 * Professor: Khan
 * 
 * Purpose: Prompt user to enter five strings
 * and then display them in reverse order
 * 
 * Notes:
 * GenericStack is in Listing 19.1
 * TODO draw UML diagram
 */

import java.util.*;

public class Q19_2
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		GenericStack<String> stack1 = new GenericStack<>();
		
		// Prompt user for five strings, then load them into the object
		System.out.print("Enter five strings: ");
		for(int i = 0; i < 5; i++)
			stack1.add(input.next());
		
		// Printing out the reverse order of the strings
		for(int i = stack1.size() - 1; i >= 0; i--)
			System.out.print(stack1.get(i) + " ");
		System.out.println();
		
		input.close();
	}
}