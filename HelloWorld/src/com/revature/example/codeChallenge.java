package com.revature.example;

public class codeChallenge {

	public static void main(String[] args) {
		System.out.println(reverse ("reversethis"));
		System.out.println(reverse ("dothis"));
		System.out.println(reverse ("cat"));
		System.out.println(reverse("dog"));

	/**
		 * 1. Without using the StringBuilder or StringBuffer class, write a method that
		 * reverses a String. Example: reverse("example"); -> "elpmaxe"
		 *
		 * @param string
		 * @return
		 */
}
		public static String reverse(String string) {
	        String reverse = "";
	        for(int i = (string.length() - 1); i >= 0; i--) {
	            reverse += string.charAt(i);
	        }
	        return reverse;
	    }
	}
