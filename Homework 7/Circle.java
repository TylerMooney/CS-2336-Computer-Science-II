/* Author: Tyler Mooney
 * Date: October 24th, 2020
 * Professor: Khan
 * 
 * Purpose: The Class is for a Circle object
 * which extend GeometricObject and implements the Comparable interface.
 * The equals method in the Object class will be overridden
 * 
 * Notes:
 * Base of the code taken from textbook listing 13.2
 * TODO remove the code you don't use
 */

public class Circle extends GeometricObject implements Comparable<Circle>{
	// Same as lines 2-47 in Listing 11.2
	private double radius;
	
	public Circle() {
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius,
			String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
	
	/** Return radius */
	public double getRadius() {
		return radius;
	}
	
	/** Set a new radius */
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	/** Return area */
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	/** Return diameter */
	public double getDiameter() {
		return 2 * radius;
	}
	
	/** Return perimeter */
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	/** Print the circle info */
	public void printCircle() {
		System.out.println("The circle is created " + getDateCreated() +
				" and the radius is " + radius);
	}
	
	// Implement the compareTo method defined in Comparable
	// Checks if the radius of the of two Circles are the same
	@Override
	public int compareTo(Circle o)
	{
		if(getRadius() > o.getRadius())
			return 1;
		else if (getRadius() < o.getRadius())
			return -1;
		else
			return 0;
	}
	
	// Overriding the equals method in the Object class
	// Checks if the object inputed is a Circle,
	// then checks if the two circles have the same radius
	@Override
	public boolean equals(Object o) {
		if(o instanceof Circle)
			return radius == ((Circle)o).radius;
		else
			return false;
	}
}
