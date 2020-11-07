/* Author: Tyler Mooney
 * Date: November 5th, 2020
 * Professor: Khan
 * 
 * Purpose: Write a test program that stores 5 million integers
 * in a linked list and test the time to traverse the list using
 * an iterator vs. using the get(index) method
 * 
 * Notes:
 * Chapter 20.5.2: The ArrayList and LinkedList classes can help
 * Chapter 20.3 and Listing 20.2 can help with Iterators
 * To make the timer, reference Q7_16 from Homework 4
 */

import java.util.LinkedList;
import java.util.Iterator;

public class Q20_6 
{
	public static void main(String[] args) 
	{
		// Creating the linked list of 5 million Integers and an iterator
		LinkedList<Integer> linkedList = new LinkedList<>();
		for(int i = 0; i < 5000000; i++)
			linkedList.add((int)(Math.random() * 100));
		Iterator<Integer> iterator = linkedList.iterator();
		
		// Acquiring how long it will take to traverse the list with get(index)
		long startTime = System.currentTimeMillis();
		linkedList.get(4999999);
		long endTime = System.currentTimeMillis();
				
		System.out.printf("Time to traverse the list using the get(index) method: %d\n", endTime - startTime);
		
		
		// Acquiring the time to get through the linked list with an iterator
		startTime = System.currentTimeMillis(); //Starting Timer
		while(iterator.hasNext())
		{
			// Going through the list
			iterator.next();
		}
		endTime = System.currentTimeMillis(); //Ending Timer
		
		System.out.printf("Time to traverse the list using an iterator: %d\n", endTime - startTime);
	}

}
