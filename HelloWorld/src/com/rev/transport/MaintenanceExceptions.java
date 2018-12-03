package com.rev.transport;

public class MaintenanceExceptions extends Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car(2021, "Elantra", "Hyundai", 50);

		try {
			myCar.move();
		} catch (MaintenanceExceptions m) {
			m.printStackTrace();
		}

		myCar.setMilesSinceOilChange(5500);

		try {
			myCar.move();
		} catch (MaintenanceExceptions m) {
			m.printStackTrace();
			myCar.setMilesSinceOilChange(0);
		
		}
		

	}

	public MaintenanceExceptions() {
		super();
	}

	public MaintenanceExceptions(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public MaintenanceExceptions(String message, Throwable cause) {
		super(message, cause);
	}

	public MaintenanceExceptions(String message) {
		super(message);
	}

	public MaintenanceExceptions(Throwable cause) {
		super(cause);
	}

}
