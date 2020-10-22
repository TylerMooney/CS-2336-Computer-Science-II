/* Author: Tyler Mooney
 * Date: September 9th, 2020
 * Professor: Khan
 * 
 * Purpose: Prompt user to enter the first 9 digits of an ISBN
 * as an integer, then calculate the checksum.
 * 
 * Notes:
 * If checksum is 10, then the last digit is denoted as X
 * How to calculate checksum;
 * (d1*1 + d2*2 + d3*3 + d4*4 + d5*5 + d6*6 + d7*7 + d8*8 + d9*9) % 11
 * You can pad a integer from the left side by doing %09
 * 	The first digit after % is the digit used to pad
 * 	The second digit after % is the total length of the integer
 * You could make calculating the checksum easier/cleaner with a loop and math.pow()
 */

import java.util.*;

public class Q3_9 {
	public static void main(String [] args)
	{
		//Variable and Scanner initialization
		Scanner input = new Scanner(System.in);
		int ISBN = 0, checkSum = 0;
		
		//Prompt user for ISBN and acquire input
		System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		ISBN = input.nextInt();

		//Calculating the checkSum
		// Use modulus and then divide to single out each digit
		checkSum = ((ISBN % 1000000000 / 100000000)
				 + (ISBN % 100000000 / 10000000) * 2
				 + (ISBN % 10000000 / 1000000) * 3
				 + (ISBN % 1000000 / 100000) * 4
				 + (ISBN % 100000 / 10000) * 5
				 + (ISBN % 10000 / 1000) * 6
				 + (ISBN % 1000 / 100) * 7
				 + (ISBN % 100 / 10) * 8
				 + (ISBN % 10) * 9) % 11;
		
		System.out.println(checkSum);
		
		//Printing results
		if(checkSum == 10)
			System.out.printf("The ISBN-10 number is %09d X", ISBN);
		else
			System.out.printf("The ISBN-10 number is %09d%d", ISBN, checkSum);
		
		input.close();
	}

}
