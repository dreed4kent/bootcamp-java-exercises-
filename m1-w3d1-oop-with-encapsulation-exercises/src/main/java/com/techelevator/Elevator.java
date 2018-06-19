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

<<<<<<< HEAD
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
=======
	private int currentFloor	;
	private int numberOfFloors;
	private boolean doorOpen;
	

		
	public Elevator(int totalNumberOfFloors) {
		this.currentFloor = 1;
		this.numberOfFloors = totalNumberOfFloors;
	}
	
	public void openDoor() {
		doorOpen = true;
	}
	
>>>>>>> 2e50540c635802e7c7aafa33c8d8d71a918e277c
	public void closeDoor() {
		doorOpen = false;
	}
	
	/*
<<<<<<< HEAD
	 *  sends the elevator upward to the desired floor as long as the door is not open. Cannot go past last floor.
	 */
	
=======
	 * sends the elevator upward to the desired floor as long as the door is not open. Cannot go past last floor.
	 */
>>>>>>> 2e50540c635802e7c7aafa33c8d8d71a918e277c
	public void goUp(int desiredFloor) {
		if (!doorOpen && desiredFloor >= this.currentFloor && desiredFloor <= numberOfFloors) {
			this.currentFloor = desiredFloor;
		}
	}
	
	/*
	 *  sends the elevator downward to the desired floor as long as the door is not open. Cannot go past floor 1.
	 */
<<<<<<< HEAD
	
	public void goDown(int desiredFloor) {
		if (!doorOpen && desiredFloor <= this.currentFloor && desiredFloor > 0) {
			this.currentFloor = desiredFloor;
		}
	}
=======
	public void goDown(int desiredFloor) {
		if (!doorOpen && desiredFloor <= this.currentFloor && desiredFloor > 0) {
			this.currentFloor = desiredFloor;
		}	
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
	
	
	
	
>>>>>>> 2e50540c635802e7c7aafa33c8d8d71a918e277c
}
