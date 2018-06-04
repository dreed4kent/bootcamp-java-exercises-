package com.techelevator.dog;

public class Dog {
	
	private boolean sleeping;

	public boolean isSleeping() {
		return sleeping;
	}

	public void setSleeping(boolean sleeping) {
		this.sleeping = sleeping;
	}
	
	public String makeSound() {
		if (this.sleeping) {
			return "Zzzzz...";
		} else {
			return "Woof!"; 
		}
		}
	
	public void sleep() {
		this.sleeping = true;
		}
	public void wakeUp() {
		this.sleeping = false;
		
	}

}
