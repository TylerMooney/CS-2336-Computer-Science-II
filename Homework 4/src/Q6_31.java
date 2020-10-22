/* Author: Tyler Mooney
 * Date: September 21st, 2020
 * Professor: Khan
 * 
 * Purpose: Prompts the user to enter a credit card number as a long int.
 * Then display whether the number is valid or invalid
 * 
 * Notes:
 * You could also implement this program by reading the input as a string
 * and processing the string to validate the credit card.
 * Check comments and see if any need clarification or deletion
 */

import java.util.*;

public class Q6_31 {

	public static void main(String[] args) {
		
		//Variable and Scanner initializations
		Scanner input = new Scanner(System.in);
		long number = 0;
		
		//Prompting for and acquiring credit card number
		System.out.print("Enter a credit card number as a long integer: ");
		number = input.nextLong();

		//Printing out results
		if(isValid(number))
			System.out.printf("%d is valid", number);
		else
			System.out.printf("%d is invalid", number);

		input.close();
	}

	/** Return true if the card number is valid */
	public static boolean isValid(long number)
	{			
		//Checking if the card has an invalid prefix
		if(!prefixMatched(number, 4) && !prefixMatched(number, 5) && !prefixMatched(number, 37) && !prefixMatched(number, 6))
			return false;
		
		//If the prefix is valid, then we check if the credit card number is valid
		//We use the Luhn check or the Mod 10 check
		int sumOfOdd = sumOfOddPlace(number);
		int sumOfEven = sumOfDoubleEvenPlace(number);
		
		//Checking if the result of step 4 is not divisible by 10, else return true
		if(((sumOfOdd + sumOfEven) % 10) > 0)
			return false;
		return true;
	}
	
	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number)
	{
		int sum = 0;
		int length = getSize(number);
		
		//Determining if the number has an odd length or not and then adding all odd place digits
				if(length % 2 == 1)
					for(int i = 2; i < length; i+=2)
						sum += getDigit((int)((long)number % (long)Math.pow(10, i) / (long)Math.pow(10, i-1)));
				else
					for(int i = 2; i <= length; i+=2)
						sum += getDigit((int)((long)number % (long)Math.pow(10, i) / (long)Math.pow(10, i-1)));
		
		return sum;
	}
	
	/** Return this number if it is a single digit, otherwise,
	 * return the sum of the two digits */
	public static int getDigit(int number)
	{
		int doubled = number * 2;
		//Returns digit if it is already a single digit
		if(doubled < 10)
			return doubled;
		return (doubled / 10) + (doubled % 10);
	}
	
	/** Return sum of odd-place digits in number */
	public static int sumOfOddPlace(long number)
	{
		int sum = 0;
		int length = getSize(number);

		//Determining if the number has an odd length or not and then adding all odd place digits
		if(length % 2 == 1)
			for(int i = 1; i <= length; i+=2)
				sum += (int)number % (long)Math.pow(10, i) / (long)Math.pow(10, i-1);
		else
			for(int i = 1; i < length; i+=2)
				sum += (long)number % (long)Math.pow(10, i) / (long)Math.pow(10, i-1);
		
		return sum;
	}
	
	/** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d)
	{
		//Acquiring the prefix
		//we use the size of d, for the possibility of a prefix longer than 1
		int prefix = (int) getPrefix(number, getSize(d));
		
		if(d == prefix)
			return true;
		else
			return false;
	}
	
	/** Return the number of digits in d */
	public static int getSize(long d)
	{
		return (int) (Math.log10(d) + 1);
	}
	
	/** Return the first k number of digits from number. If the
	 * number of digits in number is less than k, return number. */
	public static long getPrefix(long number, int k)
	{
		//Check is the length of number is less than k
		if(getSize(number) < k)
			return number;
		
		//To get the first k digits (on the left side) divide the number by the number's length minus k
		return number / (long)Math.pow(10, (getSize(number) - k));
		
	}
}
