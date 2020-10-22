/* Author: Tyler Mooney
 * Date: October 11th, 2020
 * Professor: Khan
 * 
 * Purpose: prompt the user for the values of a,b,c
 * then put those values into the quadratic equation object
 * then calculate and display the roots
 * 
 * Notes:
 */

import java.util.*;

public class QuadraticEquationTest {

	public static void main(String[] args) {
		//Initialize scanner and variables
		Scanner scan = new Scanner(System.in);
		double a = 0, b = 0, c = 0;
		
		// Acquiring a,b,c
		System.out.print("Input the value for a: ");
		a = scan.nextDouble();
		System.out.print("Input the value for b: ");
		b = scan.nextDouble();
		System.out.print("Input the value for c: ");
		c = scan.nextDouble();

		// Creating object
		QuadraticEquation quadratic = new QuadraticEquation(a,b,c);
		double root1 = quadratic.getRoot1();
		double root2 = quadratic.getRoot2();
		
		// Checking how many roots there are and printing out the results accordingly
		if(root1 == 0 && root2 == 0) // Check for no roots
		{
			System.out.println("The equation has no roots.");
		}
		else if(root1 == root2) // Check for one root
		{
			System.out.printf("The equation has one root: %s\n", root1);
		}
		else // else Printing out both roots
		{
			System.out.printf("The equation has two roots: %s and %s", root1, root2);
		}
	}

}
