/* Author: Tyler Mooney
 * Date: September 12th, 2020
 * Professor: Khan
 * 
 * Purpose: Have the user input the center x and y coordinates, width and height
 * of two rectangles. Then determine if the second rectangle is inside,
 * overlapping, or outside of the first rectangle
 * 
 * Notes:
 * How to determine if the rectangle is inside, overlapping, or outside
 * Take half the height or width and calculate the point up, down, left and right
 * Four conditionals must be true to be inside
 * At least two conditionals must be true to be overlapping
 * because only a corner could be overlapping
 * We use a counter because it's easier than using booleans
 * The counter cannot be 1 because we are dealing with a rectangle
 */

import java.util.*;

public class Q3_28 {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		double x1 = 0, y1 = 0, width1 = 0, height1 = 0;
		double x2 = 0, y2 = 0, width2 = 0, height2 = 0;
		int counter = 0;
		
		//Prompt user for r1 and r2 values and acquire them
		System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		width1 = input.nextDouble();
		height1 = input.nextDouble();
		
		System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		width2 = input.nextDouble();
		height2 = input.nextDouble();
		
		//r1 sides
		double top1 = y1 + (height1 / 2);
		double bottom1 = y1 - (height1 / 2);
		double right1 = x1 + (width1 / 2);
		double left1 = x1 - (width1 / 2);
		
		//r2 sides
		double top2 = y2 + (height2 / 2);
		double bottom2 = y2 - (height2 / 2);
		double right2 = x2 + (width2 / 2);
		double left2 = x2 - (width2 / 2);
		
		//Determining how many sides of r2 are in r1
		if(left2 <= right1) //Is left side of r2 in right side of r1
		{
			counter++;
			if(right2 <= right1) //Is right side of r2 in right side of r1
				counter++;
		}
		else if(right2 <= left1) //Is right side of r2 in left side of r1
		{
			counter++;
			if(left2 <= left1) //Is left side of r2 in left side of r1
				counter++;
		}
		
		if(bottom2 <= top1) //Is bottom side of r2 in top side of r1
		{
			counter++;
			if(top2 <= top1) //Is top side of r2 in top side of r1
				counter++;
		}
		else if(top2 <= bottom1) //Is top side of r2 in bottom side of r1
		{
			counter++;
			if(bottom2 <= bottom1) //Is bottom side of r2 in bottom side of r1
				counter++;
		}
	
		//Printing out results
		if(counter == 4)
			System.out.println("r2 is inside r1");
		else if(counter >= 2)
			System.out.println("r2 overlaps r1");
		else
			System.out.println("r2 does not overlap r1");
		
		input.close();
	}
}
