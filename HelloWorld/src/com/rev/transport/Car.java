package com.rev.transport;

public class Car extends Vehicle implements Steerable, Comparable   {

	public Car(int yearManufactured, String model, String make, double milesSinceOilChange) {
		super();
		this.yearManufactured = yearManufactured;
		this.model = model;
		this.make = make;
		this.milesSinceOilChange = milesSinceOilChange;
	}

	public Car() {
		super(); //cals vehicles
	}

	public static final int recommendedmilesBetweenOilchanges = 5000;

	private int yearManufactured;
	private String model;
	private String make;
	private double milesSinceOilChange;

	@Override
	public void move() throws MaintenanceExceptions {
		if (this.milesSinceOilChange >= recommendedmilesBetweenOilchanges) {
			
		}
		System.out.println("car is moving");

	}

	public int getYearManufactured() {
		return yearManufactured;
	}

	public void setYearManufactured(int yearManufactured) {
		this.yearManufactured = yearManufactured;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	
	public double getMilesSinceOilChange() {
		return milesSinceOilChange;
	}

	public void setMilesSinceOilChange(double milesSinceOilChange) {
		this.milesSinceOilChange = milesSinceOilChange;
	}

	@Override
	public String toString() {
		return "Car [yearManufactured=" + yearManufactured + ", model=" + model + ", make=" + make
				+ ", milesSinceOilChange=" + milesSinceOilChange + "]";
		
	
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void turnRight() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnLeft() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public int compareTo(Car o) {
		return this.model.compareTo(o.getModel())+this.model.getYearManufactured-o.getYearmanufactured;
	}

	
	}
	

	
}
