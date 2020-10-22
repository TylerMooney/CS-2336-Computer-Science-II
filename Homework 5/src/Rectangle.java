/* Author: Tyler Mooney
 * Date: October 7th, 2020
 * Professor: Khan
 * Referenced Libraries: None
 * 
 * Purpose: A basic Class meant to
 * be used in a test program
 * 
 * Notes:
 * TODO redo the purpose comment
 */

public class Rectangle 
{
	double width = 1.0;
	double height = 1.0;
	
	// Default Constructor
	public Rectangle()
	{
		
	}
	
	// Constructor
	public Rectangle(double x, double y)
	{
		width = x;
		height = y;
	}
	
	// Returns the Area
	double getArea()
	{
		return width * height;
	}
	
	// Returns the Perimeter
	double getPerimeter()
	{
		return (width * 2) + (height * 2);
	}
}
