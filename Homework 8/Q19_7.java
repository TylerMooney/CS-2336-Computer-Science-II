/* Author: Tyler Mooney
 * Date: October 28th, 2020
 * Professor: Khan
 * 
 * Purpose: The binarySearch method acquires various arrays of different types
 * and displays the index, if found
 * 
 * Notes:
 * Listing 7.7 in the textbook goes over binarySearch
 */

public class Q19_7
{
	public static void main(String[] args)
	{
		//Initializing lists
		Integer list1[] = {3, 4, 1, 2, 5};
		String list2[] = {"Hello", "World", "How", "Are", "You"};
		Character list3[] = {'h', 'o', 'r', 'a', 't', 'i', 'o'};
		Double list4[] = {3.5, 4.2, 1.1, 2.3, 5.4};
				
		//Initializing indexes
		Integer key1 = 1;
		String key2 = "Are";
		Character key3 = 'o';
		Double key4 = 3.5;
				
		//Calling method and printing out results
		System.out.println("--------- Binary Search ---------");
		System.out.println("The index for " + key1 + " in list1 is " + Q19_7.<Integer>binarySearch(list1, key1));
		System.out.println("The index for " + key2 + " in list2 is " + Q19_7.<String>binarySearch(list2, key2));
		System.out.println("The index for " + key3 + " in list3 is " + Q19_7.<Character>binarySearch(list3, key3));
		System.out.println("The index for " + key4 + " in list4 is " + Q19_7.<Double>binarySearch(list4, key4));
	}
	
	// Performs a binarySearch of the array for the key, then returns the index if found
	public static <E extends Comparable<E>> int binarySearch(E[] list, E key)
	{
		int low = 0;
		int high = list.length - 1;
		
		while(high >= low)
		{
			int mid = (low + high) / 2;
			if(key.compareTo(list[mid]) > 0)
				high = mid - 1;
			else if(key.compareTo(list[mid]) == 0)
				return mid;
			else
				low = mid + 1;
		}
		
		return -1;
	}
}
