package com.rev.transport;

public class Boat extends Vehicle implements Steerable{
	
	public Boat() {
		super();
		System.out.println("boat noargs constructor completed");
	}

	public Boat(String color, double hullLengthInMeters) {
		super();
		this.color = color;
		this.hullLengthInMeters = hullLengthInMeters;
		System.out.println("boat args constructor completed");
	}

	protected String color;
	protected double hullLengthInMeters;
	protected boolean hasHoleinHull;

	public boolean isHasHoleinHull() {
		return hasHoleinHull;
	}

	public void setHasHoleinHull(boolean hasHoleinHull) {
		this.hasHoleinHull = hasHoleinHull;
	}

	@Override
	public void move() throws MaintenanceExceptions {
		System.out.println("boat is moving");

	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getHullLengthInMeters() {
		return hullLengthInMeters;
	}

	public void setHullLengthInMeters(double hullLengthInMeters) {
		this.hullLengthInMeters = hullLengthInMeters;
	}

	@Override
	public String toString() {
		return "Boat [color=" + color + ", hullLengthInMeters=" + hullLengthInMeters + "]";
	}
	@Override
	public void turnRight() {
		System.out.println("paddle right");
	}

	@Override
	public void turnLeft() {
		System.out.println("paddle left");
	}
	
	
	
		

	
}
