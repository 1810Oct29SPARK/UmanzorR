package com.revature.calculator;

public class Calculator {

	public Calculator() {

	}

	public Double add(String toAdd) {
		Double sum = 0.0;
		if (toAdd.equals("")) {

		}
		// split the string toAdd on a , delimiter
		String[] numbers = toAdd.split(",");
		for (String number : numbers) {
			// parse the value as doubles
			sum += Double.parseDouble(number);
		}

		// return their sum
		return 0.0;

	}
}
