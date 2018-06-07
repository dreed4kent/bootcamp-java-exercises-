package com.techelevator;

public class Television {
	
	// m e m b e r   v a r i a b l e s
	
	private boolean isOn;
	private int currentChannel;
	private int currentVolume;
	
	public boolean isOn() {
		return isOn;
	}
	
	// g e t t e r s  /  s e t t e r s
	
	public int getCurrentChannel() {
		return currentChannel;
	}
	public int getCurrentVolume() {
		return currentVolume;
	}
	
	// m e t h o d s
	
	public void turnOff() {
		if (isOn) {
			isOn = !isOn;
		}
	}
	public void turnOn() {
		if (isOn) {
			isOn = true;
			currentChannel = 3;
			currentVolume = 2;
		}
	}
	public void changeChannel(int newChannel) {
//		if (newChannel) {
			
		}
//	}
	public void channelUp() {
		
	}
	public void channelDown() {
		
	}
	public void raiseVolume() {
		
	}
	public void lowerVolume() {
		
	}

}
