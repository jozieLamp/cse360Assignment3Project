
package cse360assign3;

/**
 * Class to calculate simple number operations including addition, subtraction, multiplication
 * and division of integers.
 * 
 * @author Josephine Lamp, Pin 502 for CSE 360 Spring 2016
 *
 */

public class Calculator 
{
	/** Private integer total variable to hold the total value */
	private int total;
	
	/** Private string history variable to keep track of calculator history */
	private String history = "0";
	
	/** Creates a calculator object, with default total of 0.*/
	public Calculator () 
	{
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * getTotal - returns the total computed by the calculator object
	 * @return total value
	 */
	public int getTotal () 
	{
		return total;
	}
	
	/**
	 * add - add parameter to the total value and updates history
	 * @param value integer to be added
	 */
	public void add (int value) 
	{
		total += value;
		String addString = " + " + value;
		history += addString;
	}
	
	/**
	 * subtract - subtract the parameter from the total value and updates history
	 * @param value integer to be subtracted
	 */
	public void subtract (int value) 
	{
		total -= value;
		String subtractString = " - " + value;
		history += subtractString;
	}
	
	/**
	 * multiply - multiply the parameter to the total value and updates history
	 * @param value integer to be multiplied
	 */
	public void multiply (int value) 
	{
		total *= value;
		String multiplyString = " * " + value;
		history += multiplyString;
	}
	
	/**
	 * divide - divide the total by the parameter and updates history
	 * @param value integer to divide the total by
	 */
	public void divide (int value) 
	{
		if(value == 0)
		{
			total = 0;
		}
		else
		{
			total /= value;
		}
		
		String divideString = " / " + value;
		history += divideString;
	}
	
	/**
	 * Return a string of the history of calculator changes to the total value
	 * @return string of history of changes
	 */
	public String getHistory () 
	{
		return history;
	}
}
