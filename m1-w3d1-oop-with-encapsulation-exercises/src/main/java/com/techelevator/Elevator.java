package com.techelevator;

public class Elevator {
	
	private int currentFloor;
	private int numberOfFloors;
	private boolean doorOpen;
	private int totalNumberOfFloors;
	
	public Elevator(int totalNumberOfFloors) {
		this.totalNumberOfFloors = totalNumberOfFloors;
	}

	public int getCurrentFloor() {
		return currentFloor;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public boolean isDoorOpen() {
		return doorOpen;
	}
// method
	public void openDoor() {
		
	}
	public void closeDoor() {
		
	}
	public void goUp(int desiredFloor) {
		
	}
	public void goDown(int desiredFloor) {
		
	}
}
