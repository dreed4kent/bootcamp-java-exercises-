package com.techelevator;

public class Truck implements Vehicle {
	
	private int numberOfAxels;
	private double ratePerMile;
	
	public Truck(int numberOfAxels, int ratePerMile) {
		this.numberOfAxels = numberOfAxels;
		this.ratePerMile = ratePerMile;
	}

	public Truck(String string, int i, double d) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateToll(int distance) {
		if (numberOfAxels == 4) {
			ratePerMile = 0.040;
		} else if (numberOfAxels == 6) {
			ratePerMile = 0.045;
		} else if (numberOfAxels >= 8) {
			ratePerMile = 0.048;
		}
		double toll = ratePerMile * distance;
		return toll;
	}

}
