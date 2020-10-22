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
 */

public class Stock 
{
	String symbol = "";
	String name = "";
	double previousClosingPrice = 0;
	double currentPrice = 0;
	
	// Default Constructor
	public Stock()
	{
		
	}
	
	// Default Constructor
	public Stock(String x, String y)
	{
		symbol = x;
		name = y;
	}
	
	// Returns the percentage changed from previousClosingPrice to currentPrice
	double getChangePercent()
	{
		return (currentPrice - previousClosingPrice) / previousClosingPrice;
	}
}
