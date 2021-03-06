package com.revature.vacation;

import com.rev.transport.*; //.* imports all classes in the package
//to get a specific class, use import package.classname;

//static imports within a class (ONE CLASS)
import static com.rev.transport.Car.*;

public class GoOnVacation {

	public static void main(String[] args) {

		System.out.println("let's go to Miami");
		System.out.println("we need a car");
		// using fully qualified classname of Car (package.classname)
		// com.revature.transport.Car c = new com.revature.transport.Car();
		// or we could use imports.... save us typing!!!
		Car c = new Car(2021, "spaceship", "Tesla", 50);
		System.out.println(c);// prints out whatever toString() returns
		System.out.println("do we need to change the oil first?");
		System.out.println("recommended miles between oil changes: " + Car.recommendedmilesBetweenOilchanges);
		if (c.getMilesSinceOilChange() >= recommendedmilesBetweenOilchanges) {
			System.out.println("stop! change your oil!");
		} else {
			System.out.println("good to go");
		}
		System.out.println("made it to Miami, let's go kayaking");
		Kayak k = new Kayak("red",4.2,2,2);
		//System.out.println(k.getColor());//inherited from superclass
		System.out.println(k);
	}

}