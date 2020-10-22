/* Author: Tyler Mooney
 * Date: September 21st, 2020
 * Professor: Khan
 * 
 * Purpose: Prompt the user for ten numbers (double)
 * then calculate the mean and deviation and print results
 * 
 * Notes:
 * 
 */

import java.util.*;

public class Q7_11 {
	public static void main(String[] args) {
		//Variable and Scanner initialization
		double deviation = 0, mean = 0;
		double[] numbersArray = new double[10];
		Scanner input = new Scanner(System.in);
		
		//Prompt user for the numbers and then put them into the array
		System.out.print("Enter ten numbers: ");
		for(int i = 0; i < numbersArray.length; i++)
			numbersArray[i] = input.nextDouble();
		
		//Calling the methods to calculate deviation and mean
		deviation = deviation(numbersArray);
		mean = mean(numbersArray);
		
		//Printing out results
		System.out.printf("The mean is %.2f\n", mean);
		System.out.printf("The standard deviation is %.5f\n", deviation);

		input.close();
	}
	
	/** Compute the deviation of double values */
	public static double deviation(double[] x)
	{
		double result = 0;
		double mean = 0;
		mean = mean(x);
		
		//Adding up each (value - mean)^2
		for(int i = 0; i < x.length; i++)
			result += Math.pow(x[i] - mean, 2);
		
		//Divide by n - 1
		result = result/(x.length - 1);
		
		//Take the squareroot
		result = Math.pow(result, 0.5);
		
		return result;
	}

	/** Compute the mean of an array of double values */
	public static double mean(double[] x)
	{
		double result = 0;
		
		//Adding up the values in the array
		for(int i = 0; i < x.length; i++)
			result += x[i];
		
		//Divide by n (The length of the array)
		result = result/x.length;
		
		return result;
	}

}