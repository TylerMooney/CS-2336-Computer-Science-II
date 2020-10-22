/* Author: Tyler Mooney
 * Date: September 11th, 2020
 * Professor: Khan
 * 
 * Purpose: The program will prompt the user to enter two coordinates,
 * then checks whether the point is within a circle centered at (0,0).
 * The circle has a radius of 10.
 * 
 * Notes:
 * The equation to calculate the distance of the point from the center is
 * ( ((x2 - x1)^2) + ((y2 - y1)^2) )^(1/2)
 * Since the circle is centered at (0,0), x1 and y1 are both 0
 * If needed in the future you could make x1 and y1 static variables
 */

import java.util.*;

public class Q3_22 {

	public static void main(String[] args) {
		//Variable and Scanner Initialization
		Scanner input = new Scanner(System.in);
		double x1 = 0, y1 = 0, x2 = 0, y2 = 0, distance = 0;
		
		//Prompt user for coordinates then acquire them
		System.out.print("Enter a point with two coordinates: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		
		//Calculating if the point is in the circle
		distance = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		
		//Determining if the point is in the circle or not and then printing out the result
		if(distance >= 10)
			System.out.printf("Point (%.1f, %.1f) is not in the circle\n", x2, y2);
		else
			System.out.printf("Point (%.1f, %.1f) is in the circle\n", x2, y2);

		input.close();
	}

}
