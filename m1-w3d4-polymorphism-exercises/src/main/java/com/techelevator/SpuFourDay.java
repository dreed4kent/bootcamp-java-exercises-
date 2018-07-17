package com.techelevator;

public class SpuFourDay implements DeliverDriver {
	
	private int distance;
	private int weight;
	private int rate;

	@Override
	public double calculateRate(double distance, int weight) {
		return (weight * 0.005) * distance;
	}

}
