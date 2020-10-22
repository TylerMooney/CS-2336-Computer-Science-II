/* Author: Tyler Mooney
 * Date: September 10th, 2020
 * Professor: Khan
 * 
 * Purpose: This program will prompt the user for three inputs
 * to be put into variables a, b, and c.
 * The program will then run the quadratic formula and tell the
 * user how many roots there are.
 * 
 * Notes:
 * Use Math.pow(x, 0.5) to take the square root
 * Round to 6 decimal places
 * check if the discriminant is 0
 * The discriminant is (b^2) - 4ac
 * Fix the problem where the single root prints out 6 decimal places
 * 	try if( result % 1 == 0 ) printAsInt( result )
 * 	else printAsDecimal( result )
 * I figured it out, I can just do .(insert number) for decimal places
 * EX: %.5f gives you 5 decimal places, %.0f gives you no decimal places
 * Could use DecimalFormat instead of editing the %f
 */

import java.util.*;

public class Q3_1 {

	public static void main(String[] args) {
		
		//Variable and Scanner initializations
		double a = 0.0, b = 0.0, c = 0.0, discriminant = 0.0;
		Scanner input = new Scanner(System.in);
		
		//Prompt user for variables and acquire them
		System.out.print("Enter a, b, c: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		
		//Calculating the discriminant and checking conditionals
		discriminant = (b * b) - (4 * a * c);
		if(discriminant < 0) //Determining if there is no root
		{
			System.out.println("The equation has no real roots");
		}
		else if(discriminant == 0) //Calculating the single root
		{
			System.out.printf("The equation has one root %.0f\n", -b/(2*a));
		}
		else //calculating both roots
		{
			double minusQuad = (-b - Math.pow(discriminant, 0.5))/(2 * a);
			double plusQuad = (-b + Math.pow(discriminant, 0.5))/(2 * a);
			System.out.printf("The equation has two roots %f and %.5f\n", plusQuad, minusQuad);
		}
		
		input.close();
	}

}
