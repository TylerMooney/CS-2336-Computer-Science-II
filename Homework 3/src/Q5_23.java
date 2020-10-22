/* Author: Tyler Mooney
 * Date: September 21st, 2020
 * Professor: Khan
 * 
 * Purpose: Calcuate the sum of a series from 1 to 50000
 * then show the difference between the two series
 * 
 * Notes:
 * Remember to cast the 1/i to double or use 1.0/i
 * in order to get add a double and not an integer
 * Used println in order to show more decimal places easily
 */


public class Q5_23 {

	public static void main(String[] args) {
		double leftToRightSum = 0, rightToLeftSum = 0;
		
		//From left to right
		for(int i = 1; i <= 50000; i++)
		{
			leftToRightSum += 1.0/i;
		}
		
		//From right to left
		for(int i = 50000; i > 0; i--)
		{
			rightToLeftSum += 1.0/i;
		}
		
		//I used println here so I could print out more than just 6 decimal places
		//in order to show the differences better
		System.out.println("The summation of the series from left to right: " + leftToRightSum);
		System.out.println("The summation of the series from right to left: " + rightToLeftSum);
		System.out.println("The difference between the right to left and left to right sum: " + (rightToLeftSum - leftToRightSum));


	}

}
