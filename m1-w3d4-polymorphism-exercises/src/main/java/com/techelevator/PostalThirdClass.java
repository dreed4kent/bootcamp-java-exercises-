package com.techelevator;

public class PostalThirdClass implements DeliverDriver {
	
	private double rate;
	private double distance;
	
	public PostalThirdClass(double rate, double distance) {
		this.rate = rate;
		this.distance = distance;
	}
	
	@Override
	public double calculateRate(double distance, int weight) {
		if (weight <= 2) {
			rate = 0.002;
		} else if (weight <= 8) {
			rate = 0.0022;
		} else if (weight <= 15) {
			rate = 0.0024;
		} else if (weight <= 48) {
			rate = 0.015;
		} else if (weight <= 128) {
			rate = 0.016;
		} else {
			rate = 0.017;
		}
		return distance * rate;
	}

}
