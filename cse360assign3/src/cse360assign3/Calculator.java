
package cse360assign3;

/**
 * Class to calculate simple number operations including addition, subtraction, multiplication
 * and division of numbers.
 * 
 * @author Josephine Lamp, Pin 502 for CSE 360 Spring 2016
 *
 */

public class Calculator 
{

	/** Private integer total variable to hold the total value */
	private int total;
	
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
	 * add - add parameter to the total value
	 * @param value number to be added
	 */
	public void add (int value) 
	{
		total += value;
	}
	
	/**
	 * subtract - subtract the parameter from the total value
	 * @param value number to be subtracted
	 */
	public void subtract (int value) 
	{
		total -= value;
	}
	
	/**
	 * multiply - multiply the parameter to the total value
	 * @param value number to be multiplied
	 */
	public void multiply (int value) 
	{
		total *= value;
	}
	
	/**
	 * divide - divide the total by the parameter
	 * @param value value to divide the total by
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
	}
	
	/**
	 * Return a string of the history of calculator changes to the total value
	 * @return string of history of changes
	 */
	public String getHistory () 
	{
		return "";
	}
}
