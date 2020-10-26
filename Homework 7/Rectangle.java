/* Author: Tyler Mooney
 * Date: October 24th, 2020
 * Professor: Khan
 * 
 * Purpose: The Class is for a Circle object
 * which extend GeometricObject and implements the Comparable interface.
 * The equals method in the Object class will be overridden
 * 
 * Notes:
 * Base of the code taken from textbook listing 13.3
 * TODO remove the code you don't use
 */

public class Rectangle extends GeometricObject implements Comparable<Rectangle>{
	// Same as lines 2-49 in Listing 11.3
	private double width;
	private double height;
	
	public Rectangle() {
	}
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(
			double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}
	
	/** Return width */
	public double getWidth() {
		return width;
	}
	
	/** Set a new width */
	public void setWidth(double width) {
		this.width = width;
	}
	
	/** Return height */
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	/** Return area */
	public double getArea() {
		return width * height;
	}
	
	/** return perimeter */
	public double getPerimeter() {
		return 2 * (width + height);
	}

	// Implement the compareTo method defined in Comparable
	// Checks whether or not the area is the same for both Rectangle objects
	@Override
	public int compareTo(Rectangle o) {
		if(getArea() > o.getArea())
			return 1;
		else if (getArea() < o.getArea())
			return -1;
		else
			return 0;
	}
	
	// Overriding the equals method in the Object class
	// Checks if the object inputed is a Rectangle,
	// then checks if the two circles have the same area
	@Override
	public boolean equals(Object o) {
		if(o instanceof Rectangle)
			return getArea() == ((Rectangle)o).getArea();
		else
			return false;
	}
}
