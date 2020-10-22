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
 * TODO take code from your old quadratic equation program for this
 */

public class QuadraticEquation 
{
	// Initializing Data Fields
	private double a = 0;
	private double b = 0;
	private double c = 0;
	
	// Default Constructor
	public QuadraticEquation()
	{
		
	}
	
	// Constructor
	public QuadraticEquation(double x, double y, double z)
	{
		a = x;
		b = y;
		c = z;
	}
	
	// Get methods for data fields
	double getA()
	{
		return a;
	}
	
	double getB()
	{
		return b;
	}
	
	double getC()
	{
		return c;
	}
	
	// Get methods for values
	double getDiscriminant()
	{
		return (Math.pow(b, 2)) - (4 * a * c);
	}
	
	//TODO program these two methods below
	// These two methods should return 0 if the discriminant is negative
	// If the discriminant is zero, I'll only get the first root
	// Acquire root1 which is -b +
	double getRoot1()
	{
		// Initialize variables
		double discriminant = getDiscriminant();
		double root = 0;
		
		//Checking if discriminant is positive or not
		if(discriminant < 0)
			return 0;
		
		root = Math.pow(discriminant, 0.5); // Taking the square root of the discriminant
		root = -b + root; // -b + disriminant ^ (1/2)
		root = root / (2 * a); // numerator / (2 times a)
		
		return root;
	}
	//Acquire root2 which is -b -
	double getRoot2()
	{
		// Initialize variables
				double discriminant = getDiscriminant();
				double root = 0;
				
				//Checking if discriminant is positive or not
				if(discriminant < 0)
					return 0;
				
				root = Math.pow(discriminant, 0.5); // Taking the square root of the discriminant
				root = -b - root; // -b - disriminant ^ (1/2)
				root = root / (2 * a); // numerator / (2 times a)
				
				return root;
	}
}
