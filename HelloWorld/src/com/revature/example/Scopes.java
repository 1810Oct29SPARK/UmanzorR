package com.revature.example;

public class Scopes {

	// static variable
	// in the class or "static" scope
	// variable is defined for entire class
	//should reference it using Scopes.variable1
	

	public static String variable1 = "v1";

	// this is the variable that all instances would have
	// not defined outside of an object of type command

	public String variable2 = "v2";

	// write a constructor with an argument of "v2"
	// the constructor arg has local or METHOD scope
	// constructor ard is SHADOWING (same identifier, different scope)
	// the instance variable of the same name
	// "this" prepemded is the variable name allows us to refernece the
	// instance variable instead of the locally scoped variable

	public Scopes(String variable2) {
		this.variable2 = variable2;
	}

	public static void main(String[] args) {

		System.out.println(variable1); // variable is defined
		Scopes s = new Scopes("v2"); // make instance of v2
		System.out.println(s.variable2); // variable is defined for an INSTANCE of the class
		myMethod("this is an argument to myMethod");

	}

	// variable is declared with method
	// therefore it is not accessible outside of that method
	public static void myMethod(String variable3) {
		System.out.println(variable3);
		// fun with block scope
		for (int i = 0; i < 10; i++) {
			System.out.println("value of i is:" + i);
		}
		// i is only defined for the for loop- block scope

		if (variable3.equals("v3")) {
			System.out.println(variable3);
			int j = 17;// j is only defined within this block
		} else {

		}
	}

}
