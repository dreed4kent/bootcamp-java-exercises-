package com.techelevator;

public class Airplane {
	
	private String planeNumber;
	private int bookedFirstClassSeats;
	private int totalFirstClassSeats;
	private int bookedCoachSeats;
	private int totalCoachSeats;
	private int availableFirstClassSeats;
	private int availableCoachSeats;
	
//	public int getAvailableFirstClassSeats() {						\
//		return totalFirstClassSeats - bookedFirstClassSeats;		 | <---- psydocode
//	}																/
	
	//constructor
	
	public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats){
		this.planeNumber = planeNumber;
		this.totalFirstClassSeats = totalFirstClassSeats;
		this.totalCoachSeats = totalCoachSeats;
		this.availableFirstClassSeats = totalFirstClassSeats;
		this.availableCoachSeats = totalCoachSeats;
	}
	
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

	public int getAvailableFirstClassSeats() {
		availableFirstClassSeats = totalFirstClassSeats - bookedFirstClassSeats;
		return availableFirstClassSeats;
	}

	public int getAvailableCoachSeats() {
		int availableCoachSeats = totalCoachSeats - bookedCoachSeats;
		return availableCoachSeats;
	}
	
	public boolean reserveSeats(boolean forFirstClass, int totalNumberOfSeats) {
		
		if (forFirstClass) {
			if (this.availableFirstClassSeats >= totalNumberOfSeats) { 
				this.bookedFirstClassSeats += totalNumberOfSeats;
				this.availableFirstClassSeats -= totalNumberOfSeats;
				return true;
			} else {
				return false;
			}
			
		} else {
			if (this.availableCoachSeats >= totalNumberOfSeats) {
				this.bookedCoachSeats += totalNumberOfSeats;
				this.availableCoachSeats -= totalNumberOfSeats;
				return true;
			} else {
				return false;
			}			
		}
	}
}
