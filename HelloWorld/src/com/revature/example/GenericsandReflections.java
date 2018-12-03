package com.revature.example;

import java.util.Arrays;

import java.lang.reflect.Field;

import com.rev.transport.Kayak;

public class GenericsandReflections {

	public static void main(String[] args) {
		
		/*Car c = new Car(2300, "	fury roadster", "mad max"+ 1000);
		Object[] emptyCars = (Car[]) replicate(c, 3);*/
		funwithReflections();
	
	}
	
	//fills this array of specified size with objects of the same type
	static Object[] replicate (Object o, int size) {
		Object[] replicants = new Object[size];
		for (int i = 0; i<size; i++) {
			replicants[i] = new Object();
		}
		return replicants;
		
	}
	
	static <T> Object[] replicateWithGenerics(T t, int size)  {
		Object[] replicants = new Object[size];
		for (int i = 0; i<size; i++) {
			try {
				replicants[i] = (t.getClass()).newInstance() ;
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
		}
		return replicants;
		
	}
	
	//time to use the relfection api
	//allows to perform a runtime check on a variable type
	//and do so much more
	//inspect classes at runtime as well
	
	
	static void funwithReflections() {
		
		//first thing: get a class by its fully qualified name
		

		try {
			
			//first thing: get a Class by its fully qualified name
			Class clazz = Class.forName("com.rev.transport.Kayak");
			System.out.println(clazz.getSimpleName());
			
			//get the fields of Kayak
			Field[] fields = clazz.getDeclaredFields();
			System.out.println(Arrays.toString(fields));
			
			//new instance of Kayak
			Kayak k = (Kayak) clazz.newInstance();
			Field numSeats = clazz.getDeclaredField("numSeats");
			numSeats.setAccessible(true); 
			numSeats.set(k, 5);
			System.out.println(k);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
		
	}
}
