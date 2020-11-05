/* Author: Tyler Mooney
 * Date: October 28th, 2020
 * Professor: Khan
 * 
 * Purpose: Rewrite class to extend ArrayList
 * 
 * Notes:
 * TODO Draw UML diagram
 * Taken from textbook
 */

import java.util.ArrayList;

public class GenericStack<E> extends ArrayList<E>
{
	private java.util.ArrayList<E> list = new java.util.ArrayList<>();
	
	public int getSize()
	{
		return list.size();
	}
	
	public E peek()
	{
		return list.get(getSize() - 1);
	}
	
	public void push(E o)
	{
		list.add(o);
	}
	
	public E pop()
	{
		E o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}
	
	public boolean isEmpty()
	{
		return list.isEmpty();
	}
	
	@Override
	public String toString()
	{
		return "stack: " + list.toString();
	}
}