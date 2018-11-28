package com.revature.example;

public class ControlFlow {
	public static void main(String[] args) {
		// ifStatements(7.5, 7.5);
		//forloops();
		//whileLoops();
		switchCases();
	}

	static void ifstatements(double a, double b) {

		if (a > 5) {

			System.out.println("a is greater than b");
		} else if (a == b) {
			System.out.println("a equals b");
		} else {
			System.out.println("a is les than b");
		}
	}

	static void forloops() {
		// simple for loop
		for (int i = 0; i < 10; i++) {

			System.out.println(i);
		}
		/*
		 * "for (;;)" does nothing for ever }
		 */ // "break exits structure. While continue goes to the next iteration
		for (int j = 0;; j++) {
			// System.out.println(j);
			if (j == 20) {
				break;
			}
		}
	}

	static void whileLoops() {
		int i = 0;
		while (true) {
			i += 1;
			if (i > 150) {
				break;
			}

		}
	}//do

	{
		System.out.println("do block always runs before condition");

	}

	static void switchCases() {
		//switch statement allows us to execute different behavior based on an expression
		//can be byte; short; char; int; enum; String; wrapper class
		DaysOftheWeek dayofWeek = DaysOftheWeek.Tuesday;
		switch(dayofWeek) {
		case Sunday:
			System.out.println("today is Sunday");
		case Monday:
			System.out.println("today is Monday");
		case Tuesday:
			System.out.println("today is Tuesday");
		case Wednesday:
			System.out.println("today is Monday");
		case Thursday:
			System.out.println("today is Tuesday");
		case Friday:
			System.out.println("today is Friday");
		case Saturday:
			System.out.println("today is Saturday");
			break;
		default:
			System.out.println("Today is nothing");
		}
	}
}
