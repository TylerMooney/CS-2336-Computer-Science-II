/* Author: Tyler Mooney
 * Date: September 21st, 2020
 * Professor: Khan
 * 
 * Purpose: Randomly generate an array of 100,000
 * integers and a key. Estimate the execution time 
 * of invoking the linear search method. Then sort
 * the array and estimate the execution time of
 * invoking the binarySearch method
 * 
 * Notes:
 * Check Listing 7.6 for linear search
 * Check Listing 7.7 for binary search
 * 
 * Code to estimate time
 * long startTime = System.currentTimeMillis();
 * perform the task;
 * long endTime = System.currentTimeMillis();
 * long executionTime = endTime - startTime;
 */


public class Q7_16 {
	public static void main(String[] args) {
		int[] list = new int[100000];
		int key = (int) Math.random();
		long executionTime = 0;
		
		for(int i = 0; i < 100000; i++)
		{
			list[i] = (int)Math.random();
		}
		
		//Calculating and printing out results
		executionTime = estimateLinearTime(list, key);
		System.out.printf("Time for Linear Search to occur: %d\n", executionTime);
		executionTime = estimateBinaryTime(list, key);
		System.out.printf("Time for Binary Search To occur: %d", executionTime);
	}
	
	//Estimate Linear Search Time Method
	public static long estimateLinearTime(int[] list, int key)
	{
		//Starting Timer
		long startTime = System.currentTimeMillis();
		
		//Performing the linear search for the key
		for(int i = 0; i < list.length; i++)
			if(key == list[i])
				continue;
		
		//Ending Timer
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		
		return executionTime;
	}
	
	//Estimate Binary Search Time Method
	public static long estimateBinaryTime(int[] list, int key)
	{
		//Initializing variables
		int low = 0;
		int high = list.length - 1;
		
		//Starting Timer
		long startTime = System.currentTimeMillis();
		
		//Performing the binary search for the key
		while(high >= low)
		{
			int mid = (high + low) / 2;
			if(key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				break;
			else
				low = mid + 1;
		}
		
		//would return -low -1 if we were returning the value
		//Ending Timer
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		
		return executionTime;
	}

}
