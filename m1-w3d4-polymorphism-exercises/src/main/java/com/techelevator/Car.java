package com.techelevator;

public class Car implements Vehicle {
	
	public Car(double toll, double distance) {
		this.toll = toll;
		this.distance = distance;
	}

	@Override
	public double calculateToll(int distance) {
		toll = distance * 0.020;
		return toll;
	}
	

}
