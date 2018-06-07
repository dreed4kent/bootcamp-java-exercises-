package com.techelevator;

public class Elevator {
	
	// m e m b e r   v a r i a b l e s
	
	private int currentFloor;
	private int numberOfFloors;
	private boolean doorOpen;
	private int totalNumberOfFloors;
	
	// c o n s t r u c t o r
	
	public Elevator(int totalNumberOfFloors) {		//a default constructor has no arguments (nothing in the "( )" commas)
		this.currentFloor = 1;
		this.numberOfFloors = totalNumberOfFloors;
	}
	
	// g e t t e r s  /  s e t t e r s

	public int getCurrentFloor() {
		return currentFloor;
	}

	public int getNumberOfFloors() {
		return numberOfFloors;
	}

	public boolean isDoorOpen() {
		return doorOpen;
	}
	
	// m e t h o d
	
	public void openDoor() {
		doorOpen = true;
	}
	public void closeDoor() {
		doorOpen = false;
	}
	
	/*
	 *  sends the elevator upward to the desired floor as long as the door is not open. Cannot go past last floor.
	 */
	
	public void goUp(int desiredFloor) {
		if (!doorOpen && desiredFloor >= this.currentFloor && desiredFloor <= numberOfFloors) {
			this.currentFloor = desiredFloor;
		}
	}
	
	/*
	 *  sends the elevator downward to the desired floor as long as the door is not open. Cannot go past floor 1.
	 */
	
	public void goDown(int desiredFloor) {
		if (!doorOpen && desiredFloor <= this.currentFloor && desiredFloor > 0) {
			this.currentFloor = desiredFloor;
		}
	}
}
