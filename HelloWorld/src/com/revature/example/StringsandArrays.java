package com.revature.example;

import java.util.Arrays;

import com.rev.transport.Car;
import com.rev.transport.Kayak;
import com.rev.transport.Tornado;
import com.rev.transport.Vehicle;

public class StringsandArrays {

	public static void main(String[] args) {
		//funWithStrings();
		funWithArrays();
	}

	static void funWithArrays() {
		String[] arr1 = { "this", "is", "an", "array" };

		//
		
		for (String s : arr1) {
			System.out.println(s);
		}

		String[] arr2 = new String[4];
		for (int i = 0; i < arr2.length; i++) {
			arr2[1] = "element" + i;

		}

		// System.out.println(arr2.toString(i));
		System.out.println(Arrays.toString(arr2));
		int[][] arr3 = new int[4][3];
		arr3[0][0] = 7;
		arr3[0][2] = 8;
		arr3[3][0] = 9;
		arr3[3][2] = 10;

		for (int[] a : arr3) {
			System.out.println(Arrays.toString(a));
		}

		Vehicle[] vehicles = new Vehicle[4];
		System.out.println(Arrays.toString(vehicles));
		vehicles[2].move();
		vehicles[0] = new Tornado(147.2);
		vehicles[1] = new Kayak("red", 4, 2, 2, 2);
		vehicles[2] = new Car(2021, "spaceship", "Tesla", 50);
		vehicles[3] = new Tornado(256.4);

	}


	static void funWithStrings() {
		String a = "hello world";
		String b = new String("hello");

		// equal() is inherited from an object
		// most references type override to define "equally"
		// usually by the fields
		System.out.println("String a is equal to String b: " + a.equals(b));

		// == is good for comparing primitives
		// or checking whether 2 objects are the same object
		// comparing the reference

		System.out.println("String a is the same object as b: " + (a == b));

		// a and b are 2 different objects pointing the same object in the string pool

		// String api methods
		// substring
		// concat
		// toUpperCase
		// toLowerCase
		// indexOf
		// split
		// trim

		String test = "hello world";
		System.out.println(test.toUpperCase());
		String test2 = "HELLO WORLD";
		System.out.println(test2.toLowerCase());
		System.out.println(test.substring(3, 8));
		System.out.println(test.concat(test2));
		System.out.println(test.replace('l', 'd'));
		System.out.println(test.indexOf('l'));
		String test3 = "the quick brown fox jumped over the lazy dog";
		String[] words = test3.split("");
		for (String w : words) {
			System.out.println(w);
		}
	}

}
