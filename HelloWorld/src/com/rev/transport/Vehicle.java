package com.rev.transport;

/*
 * Abstract class cannot be instantiated
 * if there is ONE (or more) abstract method(s), THE CLASS MUST BE ABSTRACT
 * (note: opposite of "abstract" in Java is "concrete"(but there is no kw for it))
 */
public abstract class Vehicle {
	
	public Vehicle() {
		super();
		System.out.println("Vehicle constructor completed");
		 //calls Object()
	}

	/*
	 * I will have to implement this method in the first concrete subclass
	 */
	public abstract void move() throws MaintenanceExceptions;
}