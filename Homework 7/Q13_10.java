/* Author: Tyler Mooney
 * Date: October 24th, 2020
 * Professor: Khan
 * 
 * Purpose: Program creates Rectangle objects
 * and checks whether or not the specific Rectangle objects
 * are the equal or not.
 * 
 * Notes:
 * I could probably set this up to work with a scanner
 * for user input, but I'm just using this for testing
 * purposes to make sure the edited Rectangle Object works properly.
 * This is just rudimentary code to test the compareTo method,
 * but I could make a more sophisticated test code
 * The compareTo checks whether the areas of the two objects are the same
 */

public class Q13_10
{
	public static void main(String[] args) {
		//Creating Rectangle objects
		Rectangle rectangle1 = new Rectangle(1.0, 1.0, "red", true);
		Rectangle rectangle2 = new Rectangle(1.0, 1.0, "blue", false);
		Rectangle rectangle3 = new Rectangle(2.0, 2.0, "red", false);
		Rectangle rectangle4 = new Rectangle(2.0, 2.0, "blue", true);
		
		// Checks if the rectangles are the same using the overriding compareTo
			System.out.println("Using compareTo\n---------------------------");
				
			// Check if rectangle1 and rectangle2 are equal objects
			if(rectangle1.compareTo(rectangle2) == 0)
				System.out.println("Rectangle1 and Rectangle2 are equal");
			else
				System.out.println("Rectangle1 and Rectangle2 are not equal");
				
			// Check if rectangle1 and rectangle3 are equal objects
			if(rectangle1.compareTo(rectangle3) == 0)
				System.out.println("Rectangle1 and Rectangle3 are equal");
			else
				System.out.println("Rectangle1 and Rectangle3 are not equal");
			
			// Check if rectangle1 and rectangle4 are equal objects
			if(rectangle1.compareTo(rectangle4) == 0)
				System.out.println("Rectangle1 and Rectangle4 are equal");
			else
				System.out.println("Rectangle1 and Rectangle4 are not equal");
					
			// Check if rectangle2 and rectangle3 are equal objects
			if(rectangle2.compareTo(rectangle3) == 0)
				System.out.println("Rectangle2 and Rectangle3 are equal");
			else
				System.out.println("Rectangle2 and Rectangle3 are not equal");
				
			// Check if rectangle1 and rectangle2 are equal objects
			if(rectangle2.compareTo(rectangle4) == 0)
				System.out.println("Rectangle2 and Rectangle4 are equal");
			else
				System.out.println("Rectangle2 and Rectangle4 are not equal");
						
			// Check if rectangle3 and rectangle4 are equal objects
			if(rectangle3.compareTo(rectangle4) == 0)
				System.out.println("Rectangle3 and Rectangle4 are equal");
			else
				System.out.println("Rectangle3 and Rectangle4 are not equal");
			
/********************************************************************************************/
			// Checks if the rectangles are the same using the overriding equals
			System.out.println("\nUsing equals\n---------------------------");
				
			// Check if rectangle1 and rectangle2 are equal objects
			if(rectangle1.equals(rectangle2))
				System.out.println("Rectangle1 and Rectangle2 are equal");
			else
				System.out.println("Rectangle1 and Rectangle2 are not equal");
				
			// Check if rectangle1 and rectangle3 are equal objects
			if(rectangle1.equals(rectangle3))
				System.out.println("Rectangle1 and Rectangle3 are equal");
			else
				System.out.println("Rectangle1 and Rectangle3 are not equal");
				
			// Check if rectangle1 and rectangle4 are equal objects
			if(rectangle1.equals(rectangle4))
				System.out.println("Rectangle1 and Rectangle4 are equal");
			else
				System.out.println("Rectangle1 and Rectangle4 are not equal");
							
			// Check if rectangle2 and rectangle3 are equal objects
			if(rectangle2.equals(rectangle3))
				System.out.println("Rectangle2 and Rectangle3 are equal");
			else
				System.out.println("Rectangle2 and Rectangle3 are not equal");
				
			// Check if rectangle1 and rectangle2 are equal objects
			if(rectangle2.equals(rectangle4))
				System.out.println("Rectangle2 and Rectangle4 are equal");
			else
				System.out.println("Rectangle2 and Rectangle4 are not equal");
						
			// Check if rectangle3 and rectangle4 are equal objects
			if(rectangle3.equals(rectangle4))
				System.out.println("Rectangle3 and Rectangle4 are equal");
			else
				System.out.println("Rectangle3 and Rectangle4 are not equal");	
	}

}
