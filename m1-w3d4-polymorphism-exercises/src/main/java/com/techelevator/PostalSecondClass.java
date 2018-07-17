package com.techelevator;

public class PostalSecondClass implements DeliverDriver {
	
	private double rate;
	private double distance;
	
	public PostalSecondClass(double rate, double distance) {
		this.rate = rate;
		this.distance = distance;
	}

	@Override
	public double calculateRate(double distance, int weight) {
		if (weight <= 2) {
			rate = 0.035;
		} else if (weight <= 8) {
			rate = 0.040;
		} else if (weight <= 15) {
			rate = 0.047;
		} else if (weight <= 48) {
			rate = 0.195;
		} else if (weight <= 128) {
			rate = 0.450;
		} else {
			rate = 0.5;
		}
		return distance * rate;
	}

}