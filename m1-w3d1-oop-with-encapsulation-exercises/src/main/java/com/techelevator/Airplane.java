package com.techelevator;

public class Airplane {
	
	private String planeNumber;
	private int bookedFirstClassSeats;
	private int totalFirstClassSeats;
	private int bookedCoachSeats;
	private int totalCoachSeats;
	private boolean firstClass;
	
	//constructor
	
	Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats){
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
	}
	
//getters/setters
	
	public String getPlaneNumber() {
		return planeNumber;
	}

	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}

	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}

	public int getBookedCoachSeats() {
		return bookedCoachSeats;
	}

	public int getTotalCoachSeats() {
		return totalCoachSeats;
	}
	
	public int availableFirstClassSeats() {
		int openFirstClassSeats = this.totalFirstClassSeats - this.bookedFirstClassSeats;
		return openFirstClassSeats;
	}
	
	public int availableCoachSeats() {
		int openCoachSeats = this.totalCoachSeats - this.bookedCoachSeats;
		return openCoachSeats;
	}
	
	//method
	
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		boolean result = false;
		
		if (forFirstClass == true) {
			if (availableFirstClassSeats() >= totalNumberOfSeats) {                  // checking to see if there were enough first class seats 
				bookedFirstClassSeats = totalNumberOfSeats + bookedFirstClassSeats;
				result = true;
			} else {
				result = false;
			}
			
		} else {
			if (availableCoachSeats() >= totalNumberOfSeats) {
				bookedCoachSeats = totalNumberOfSeats + bookedCoachSeats;
				result = true;
			} else {
				result = false;
			}
			
			
		}

		return result;
	}
}
