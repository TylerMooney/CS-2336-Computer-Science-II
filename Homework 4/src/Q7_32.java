import java.util.Scanner;

/* Author: Tyler Mooney
 * Date: September 26st, 2020
 * Professor: Khan
 * 
 * Purpose: Have the user enter in the array length and values
 * then partition the array and print results.
 * 
 * Notes:
 * You have to choose the Pivot (The index in the array)
 * The pivot is the first element
 * http://liveexample.pearsoncmg.com/dsanimation/QuickSortNeweBook.html
 * Used this link from the textbook that explains how to partition a list
 * with a pivot
 */


public class Q7_32 {
	public static void main(String[] args) {
		//Variable and Scanner initialization
		Scanner input = new Scanner(System.in);
		
		//Prompt user and acquire array length and values
		System.out.print("Enter list: ");
		int[] list = new int[input.nextInt()];
		for(int i = 0; i < list.length; i++)
			list[i] = input.nextInt();
		
		//Calling the partition method
		partition(list);
		
		//printing out the partitioned array
		System.out.print("After the partition, the list is ");
		for(int i = 0; i < list.length; i++)
			System.out.printf("%d ", list[i]);

		input.close();
	}
	
	//Partitions the list using the first element, called a pivot
	public static int partition(int[] list)
	{
		//Pivot is set to 0, because the first element is the pivot
		int low = 1, high = list.length - 1, temp = 0, pivot = 0;
		
		//Website instructions
		//A new random list is created
		//Since list[row] <= pivot, low was moved forward
		//Since list[high] > pivot, high was moved backward
		//Else the list[low] and list[high] are swapped, when low <= high
		//I used a while for the first two checks because I kept having an error
		//Where it'd swap the high and low when they shouldn't have
		
		//Partitioning the array
		while(low < high)
		{
			while(list[low] <= list[pivot])
				low++;
			while(list[high] > list[pivot])
				high--;
			if(low <= high)
			{
				temp = list[low];
				list[low] = list[high];
				list[high] = temp;
			}
		}

		//Doing final partition with pivot, if needed
		while(high > pivot)
		{
			if(list[high] < list[pivot])
			{
				temp = list[pivot];
				list[pivot] = list[high];
				list[high] = temp;
				break;
			}
			high--;
		}
		
		//Not sure why I'd be returning an int if I'm not using it,
		//So I just return the place of the new pivot
		return high;
	}

}
