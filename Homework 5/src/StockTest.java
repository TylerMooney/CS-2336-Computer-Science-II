/* Author: Tyler Mooney
 * Date: October 11th, 2020
 * Professor: Khan
 * Referenced Libraries: None
 * 
 * Purpose: Creates a stock object, assigns the
 * previous closing price and current price, then
 * calculates and prints out the percent change from
 * previous closing price to current price
 * 
 * Notes:
 * 
 */

public class StockTest 
{
	public static void main(String[] args) 
	{
		// Creating stock object
		Stock stock1 = new Stock("ORCL", "Oracle Corporation");
		stock1.previousClosingPrice = 34.5;
		stock1.currentPrice = 34.35;
		
		// Prints out the percent change up to 2 or 3 decimals depending on if positive or negative
		System.out.printf("The price-change percentage: %.5s%%", stock1.getChangePercent() * 100);
	}

}
