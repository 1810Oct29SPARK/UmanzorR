package codechallenge;

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Driver {

	public static void main(String[] args) {
		String start = "";
		String end = "";
		String bank = "";

		String fileName = "C:\\Users\\Ryan Umanzor\\Documents\\GitHub\\exercise-submissions\\exercise-submissions\\MinimumMutations";

		String line = null;

		try {
			FileReader fileReader = new FileReader(fileName);

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null)
				;
			{
				if (line.contains("beginning")) {
					for (int i = 0; i < line.length(); ++i) {
						if (Character.isUpperCase(line.charAt(i))) {
							start += line.charAt(i);
						}
					}
					System.out.println(start);
					start = "";

				}
				if (line.contains("end"))
					;
				for (int i = 0; i < line.length(); ++i) {
					if (Character.isUpperCase(line.charAt(i))) {
						end += line.charAt(i);
					}
				}
			}

			try {
				bufferedReader.close();
			} catch (IOException e) {
				System.out.println("can't open file " + fileName + "");
				e.printStackTrace();
			}
		} catch (FileNotFoundException ex) {
			System.out.println("can't open file " + fileName + "");
		} catch (IOException e) {
			System.out.println("can't open file " + fileName + "");
			e.printStackTrace();
		}

	}

}
