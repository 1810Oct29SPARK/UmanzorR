package com.revature.demo;

import org.junit.*;

public class JUnitProcedureTest {
	
	@BeforeClass
	public static void beforeAllTests() {
		
		System.out.println("In beforeAllTests");
	}
	
	@Before
	public void beforeTests() {
		
		System.out.println("In beforeTests");
	}
	
	@Test
	public void testCase1() {
		System.out.println("In testCase1");
		
	}
	
	@Test
	public void testCase2() {
		
		System.out.println("In testCase2");
		
	}
	
	@After
	public  void afterTests() {
		
		System.out.println("In afterTests");
		
	}
	
	@AfterClass
	public static void afterAllTests() {
		
		System.out.println("In afteAllTests");
	}

}
