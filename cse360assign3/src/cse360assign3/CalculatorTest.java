package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest 
{

	/* Tests the calculator constructor by seeing if it is null after an object is created */
	@Test
	public void calculator() 
	{
		Calculator testcalc = new Calculator();
		assertNotNull(testcalc);
	}
	
	/* Tests the get Total method by calling methods and checking if the updated total value is correct */
	@Test
	public void testGetTotal() 
	{
		Calculator calc = new Calculator();
		assertEquals(0, calc.getTotal());
		
		calc.add(1);
		assertEquals(1, calc.getTotal());
		
		calc.multiply(10);
		assertEquals(10, calc.getTotal());
		
		calc.divide(2);
		assertEquals(5, calc.getTotal());
		
		calc.subtract(3);
		assertEquals(2, calc.getTotal());
		
		calc.add(100);
		assertEquals(102, calc.getTotal());
		
		calc.multiply(100);
		assertEquals(10200, calc.getTotal());
		
		calc.divide(20);
		assertEquals(510, calc.getTotal());
		
		calc.subtract(10);
		assertEquals(500, calc.getTotal());
	}

	/* Tests the add method by adding 0, different integers and negative integers */
	@Test
	public void testAdd() 
	{
		Calculator calc = new Calculator();
		
		calc.add(0);
		assertEquals(0,calc.getTotal());
		
		calc.add(10);
		assertEquals(10, calc.getTotal());
		
		calc.add(-5);
		assertEquals(5, calc.getTotal());
		
		calc.add(1234);
		assertEquals(1239, calc.getTotal());
		
		calc.add(2222);
		assertEquals(3461, calc.getTotal());
		
		calc.add(100000);
		assertEquals(103461, calc.getTotal());
		
	}

	/* Tests the subtract method by subtracting different integers including 0 and negative integers */
	@Test
	public void testSubtract() 
	{
		Calculator calc = new Calculator();
		
		calc.add(100);
		
		calc.subtract(0);
		assertEquals(100, calc.getTotal());
		
		calc.subtract(10);
		assertEquals(90, calc.getTotal());
		
		calc.subtract(35);
		assertEquals(55,calc.getTotal());
		
		calc.subtract(60);
		assertEquals(-5, calc.getTotal());
		
		calc.subtract(100);
		assertEquals(-105, calc.getTotal());
		
		calc.subtract(222222);
		assertEquals(-222327, calc.getTotal());
		
	}

	/* Tests the multiply method by multiplying different integers including 0 and negative integers */
	@Test
	public void testMultiply() 
	{
		Calculator calc = new Calculator();
		
		calc.add(100);
		
		calc.multiply(10);
		assertEquals(1000, calc.getTotal());
		
		calc.multiply(-2);
		assertEquals(-2000, calc.getTotal());
		
		calc.multiply(3);
		assertEquals(-6000, calc.getTotal());
		
		calc.multiply(0);
		assertEquals(0, calc.getTotal());
		
		calc.multiply(10);
		assertEquals(0,calc.getTotal());
		
		calc.add(20);
		calc.multiply(987654);
		assertEquals(19753080, calc.getTotal());
	}

	/* Tests the divide method by calling the divide method with different integers including 0 and negative numbers */
	@Test
	public void testDivide() 
	{
		Calculator calc = new Calculator();
		
		calc.add(100);
		calc.divide(10);
		assertEquals(10, calc.getTotal());
		
		calc.divide(3);
		assertEquals(3, calc.getTotal());
		
		calc.divide(3);
		assertEquals(1, calc.getTotal());
		
		calc.divide(0);
		assertEquals(0, calc.getTotal());
		
		calc.add(20);
		calc.divide(40);
		assertEquals(0,calc.getTotal());
		
		calc.add(100000);
		calc.divide(1000);
		assertEquals(100, calc.getTotal());
	}

	/* Tests the getHistory method by calling calculation operations and checking the history string returned */
	@Test
	public void testGetHistory() 
	{
		Calculator calc = new Calculator();
		assertEquals("0", calc.getHistory());
		
		calc.add(4);
		assertEquals("0 + 4", calc.getHistory());
		
		calc.multiply(100);
		assertEquals("0 + 4 * 100", calc.getHistory());
		
		calc.subtract(55);
		assertEquals("0 + 4 * 100 - 55", calc.getHistory());
		
		calc.divide(21);
		assertEquals("0 + 4 * 100 - 55 / 21", calc.getHistory());
		
		Calculator calcTwo = new Calculator();
		
		calcTwo.add(300);
		calcTwo.divide(0);
		assertEquals("0 + 300 / 0", calcTwo.getHistory());
		
		calcTwo.add(1000);
		calcTwo.subtract(0);
		calcTwo.multiply(9);
		calcTwo.divide(3);
		calcTwo.multiply(20);
		calcTwo.subtract(99);
		calcTwo.divide(78);
		calcTwo.add(8);
		assertEquals("0 + 300 / 0 + 1000 - 0 * 9 / 3 * 20 - 99 / 78 + 8", calcTwo.getHistory());
	}

}
