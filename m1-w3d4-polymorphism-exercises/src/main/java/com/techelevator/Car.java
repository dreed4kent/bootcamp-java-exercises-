package com.techelevator;

public class Car implements Vehicle {
	
	boolean hasTrailer;
	
	public Car(boolean hasTrailer) {
		this.hasTrailer = hasTrailer;
	}

	public Car(String string, int i, double d) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateToll(int distance) {
		double toll = distance * 0.020;
		if (hasTrailer) {
			return toll += 1.00;
		}
		return toll;
	}
}
