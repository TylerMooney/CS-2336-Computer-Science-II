/* Author: Tyler Mooney
 * Date: October 11th, 2020
 * Professor: Khan
 * Referenced Libraries: None
 * 
 * Purpose: Create two Rectangle objects, then
 * display width, height, area, and perimeter
 * 
 * Notes:
 * TODO Format the print statements from println to printf
 */
public class RectangleTest {

	public static void main(String[] args) {
		// Initializing Rectangle Objects
		Rectangle rectangle1 = new Rectangle(4, 40);
		Rectangle rectangle2 = new Rectangle(3.5, 35.9);
		
		// Printing out information of Rectangle 1
		System.out.println("The width of Rectangle1: " + rectangle1.width);
		System.out.println("The height of Rectangle1: " + rectangle1.height);
		System.out.println("The area of Rectangle1: " + rectangle1.getArea());
		System.out.println("The perimeter of Rectangle1: " + rectangle1.getPerimeter() + "\n");
		
		// Printing out information of Rectangle 2
		System.out.println("The width of Rectangle2: " + rectangle2.width);
		System.out.println("The height of Rectangle2: " + rectangle2.height);
		System.out.println("The area of Rectangle2: " + rectangle2.getArea());
		System.out.println("The perimeter of Rectangle2: " + rectangle2.getPerimeter() + "\n");
	}

}
