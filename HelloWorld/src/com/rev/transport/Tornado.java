package com.rev.transport;

import com.rev.transport.Vehicle;

public class Tornado extends Vehicle {

	public Tornado(double maxWindSpeed) {
		super();
		this.maxWindSpeed = maxWindSpeed;
	}

	public Tornado() {
	}
	
	private double maxWindSpeed;
	private boolean isInSuperCell;

	@Override
	public void move() throws MaintenanceExceptions {
		if (!this.isInSuperCell) {
			throw new MaintenanceExceptions("weather machine incorrectly configured");
		}
		System.out.println("DESTROYING THE CITY");
	}

	public double getMaxWindSpeed() {
		return maxWindSpeed;
	}

	public void setMaxWindSpeed(double maxWindSpeed) {
		this.maxWindSpeed = maxWindSpeed;
	}

	@Override
	public String toString() {
		return "Tornado [maxWindSpeed=" + maxWindSpeed + "]";
	}

}