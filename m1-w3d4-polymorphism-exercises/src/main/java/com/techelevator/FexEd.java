package com.techelevator;

public class FexEd implements DeliverDriver {
	
	private double weight;
	private double distance;
	
	public FexEd(double weight, double distance) {
		this.weight = weight;
		this.distance = distance;
	}

	@Override
	public double calculateRate(double distance, int weight) {
		double rate = 20;
		if (distance > 500) {
			rate = rate + 5.00;
		}
		if (weight > 48) {
			rate = rate + 3.00;
		}
		return rate;
	}

}
