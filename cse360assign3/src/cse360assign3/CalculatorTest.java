package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest 
{

	@Test
	public void calculator() 
	{
		Calculator testcalc = new Calculator();
		assertNotNull(testcalc);
	}
	
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
	}

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
		
	}

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
		
	}

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
	}

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
	}

	@Test
	public void testGetHistory() 
	{
		Calculator calc = new Calculator();
		
		assertEquals("", calc.getHistory());
		
		calc.add(100);
		calc.multiply(10);
		
		assertEquals("", calc.getHistory());
	}

}
