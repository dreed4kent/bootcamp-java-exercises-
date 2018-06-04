package com.techelevator.calculator;

public class Calculator {

	private int currentValue;

	public int getCurrentValue() {
		return currentValue;
	}

	public void setCurrentValue(int currentValue) {
		this.currentValue = currentValue;
	}
	
	public int add(int addend) {
		return this.currentValue += addend;
	}
	public int multiply(int multiplier) {
		return this.currentValue *= multiplier;
	}
	public int subtract(int subtrahend) {
		return this.currentValue -= subtrahend;
	}
	public int power(int exponent) {
		return this.currentValue = (int) Math.pow(currentValue, exponent);
	}
	public void reset() {
		this.currentValue = 0;
	}
}
