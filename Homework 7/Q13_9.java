/* Author: Tyler Mooney
 * Date: October 24th, 2020
 * Professor: Khan
 * 
 * Purpose: Program creates Circle objects
 * and checks whether or not the specific Circle objects
 * are the equal or not.
 * 
 * Notes:
 * I could probably set this up to work with a scanner
 * for user input, but I'm just using this for testing
 * purposes to make sure the edited Circle Object works properly.
 * This is just rudimentary code to test the compareTo method,
 * but I could make a more sophisticated test code
 * The compareTo checks whether the radii of the two objects are the same
 */

public class Q13_9 {

	public static void main(String[] args) {
		//Creating Circle objects
		Circle circle1 = new Circle(1.0, "red", true);
		Circle circle2 = new Circle(1.0, "blue", false);
		Circle circle3 = new Circle(2.0, "red", false);
		Circle circle4 = new Circle(2.0, "blue", true);
		
		// Checks if the circles are the same using the overriding compareTo
		System.out.println("Using compareTo\n---------------------------");
		
		// Check if circle1 and circle2 are equal objects
		if(circle1.compareTo(circle2) == 0)
			System.out.println("Circle1 and Circle2 are equal");
		else
			System.out.println("Circle1 and Circle2 are not equal");
		
		// Check if circle1 and circle3 are equal objects
		if(circle1.compareTo(circle3) == 0)
			System.out.println("Circle1 and Circle3 are equal");
		else
			System.out.println("Circle1 and Circle3 are not equal");
		
		// Check if circle1 and circle4 are equal objects
		if(circle1.compareTo(circle4) == 0)
			System.out.println("Circle1 and Circle4 are equal");
		else
			System.out.println("Circle1 and Circle4 are not equal");
				
		// Check if circle2 and circle3 are equal objects
		if(circle2.compareTo(circle3) == 0)
			System.out.println("Circle2 and Circle3 are equal");
		else
			System.out.println("Circle2 and Circle3 are not equal");
		
		// Check if circle1 and circle2 are equal objects
		if(circle2.compareTo(circle4) == 0)
			System.out.println("Circle2 and Circle4 are equal");
		else
			System.out.println("Circle2 and Circle4 are not equal");
				
		// Check if circle3 and circle4 are equal objects
		if(circle3.compareTo(circle4) == 0)
			System.out.println("Circle3 and Circle4 are equal");
		else
			System.out.println("Circle3 and Circle4 are not equal");
		
/********************************************************************************************/
		// Checks if the circles are the same using the overriding equals
		System.out.println("\nUsing equals\n---------------------------");
		
		// Check if circle1 and circle2 are equal objects
		if(circle1.equals(circle2))
			System.out.println("Circle1 and Circle2 are equal");
		else
			System.out.println("Circle1 and Circle2 are not equal");
		
		// Check if circle1 and circle3 are equal objects
		if(circle1.equals(circle3))
			System.out.println("Circle1 and Circle3 are equal");
		else
			System.out.println("Circle1 and Circle3 are not equal");
		
		// Check if circle1 and circle4 are equal objects
		if(circle1.equals(circle4))
			System.out.println("Circle1 and Circle4 are equal");
		else
			System.out.println("Circle1 and Circle4 are not equal");
						
		// Check if circle2 and circle3 are equal objects
		if(circle2.equals(circle3))
			System.out.println("Circle2 and Circle3 are equal");
		else
			System.out.println("Circle2 and Circle3 are not equal");
		
		// Check if circle1 and circle2 are equal objects
		if(circle2.equals(circle4))
			System.out.println("Circle2 and Circle4 are equal");
		else
			System.out.println("Circle2 and Circle4 are not equal");
				
		// Check if circle3 and circle4 are equal objects
		if(circle3.equals(circle4))
			System.out.println("Circle3 and Circle4 are equal");
		else
			System.out.println("Circle3 and Circle4 are not equal");
	}

}
