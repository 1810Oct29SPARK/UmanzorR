package com.rev.transport;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparisons {

	public static void main(String[] args) {
		List<Car> carList = new ArrayList<Car>();
		carList.add(new Car(2021, "spaceship", "Tesla", 50));
		carList.add(new Car(1997, "Fiesta", "Ford", 500));
		carList.add(new Car (2007,"Fancy", "Cadillac", 50));
		System.out.println(carList.get(0).compareTo(carList.get(2)));
		for(Car c : carList) {
			System.out.println(c);
		}
	} 
	static List<Car> sortWithComparable(List<Car> carList){
		Collections.sort(carList);
		System.out.println("Cars after sort");
		for(Car c : carList) {
			System.out.println(c);
		
		return carList;
		}
	}
	
	static void sortWithComparator(List<Car> carList, Comparator c) {
		Collections,sort(carList, c);
		System.out.println("Cars after sort wuth");
	}

}
