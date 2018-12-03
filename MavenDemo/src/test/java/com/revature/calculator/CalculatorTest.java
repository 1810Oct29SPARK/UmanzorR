package com.revature.calculator;

import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {
	
	private Calculator c;
	
	@Before
	public void setCalculator() {
		this.c = new Calculator();
		
	}
	
	//IDD
	//red green refactoring
	//start with requirement, write test, build code to match
	
	//calculate requriements
	//(calculate class)
	//1. calling add("") returns Double value of 0
	//2. calling two comma-separated values return the sum of those values
	//3. calling add() with null returns zero
	//4. calling add() with > 2 argument ignores
	//5. calling add() with incorrect characters (anything but, andDouble 
	//throws calculator
	
	public void emptyStringReturnsZero() {
		assertEquals(0, c.add(""),001 ); //Floating point assertions require an offset
		
	}
	
	public void twoNumberReturnsSum() {
		assertEquals(28.2,c.add("12.9,15.5"), .001);
		
	}
	
	
 
}
