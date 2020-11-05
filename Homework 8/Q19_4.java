/* Author: Tyler Mooney
 * Date: October 28th, 2020
 * Professor: Khan
 * 
 * Purpose: The linearSearch method acquires various arrays of different types
 * and displays the index, if found
 * 
 * Notes:
 * TODO add some kind of error handling
 */

public class Q19_4 
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
		System.out.println("--------- Linear Search ---------");
		System.out.println("The index for " + key1 + " in list1 is " + Q19_4.<Integer>linearSearch(list1, key1));
		System.out.println("The index for " + key2 + " in list2 is " + Q19_4.<String>linearSearch(list2, key2));
		System.out.println("The index for " + key3 + " in list3 is " + Q19_4.<Character>linearSearch(list3, key3));
		System.out.println("The index for " + key4 + " in list4 is " + Q19_4.<Double>linearSearch(list4, key4));
	}
	
	// Does a linear search for the key in an array, then returns the index if found
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key)
	{
		for(int i = 0; i < list.length; i++)
			if(key.compareTo(list[i]) == 0)
				return i;
		
		return -1;
	}
}
