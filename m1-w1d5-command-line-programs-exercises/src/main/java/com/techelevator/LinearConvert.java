package com.techelevator;

import java.util.Scanner;

/*
 The foot to meter conversion formula is:
 	m = f * 0.3048
 	
 The meter to foot conversion formula is:
 	f = m * 3.2808399
 	
 Write a command line program which prompts a user to enter a length, and whether the measurement is in (m)eters or (f)eet.
 Convert the length to the opposite measurement, and display the old and new measurements to the console.
  
 $ java LinearConvert
 Please enter the length: 58
 Is the measurement in (m)eter, or (f)eet? f
 58f is 17m.
 */

public class LinearConvert {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a length: ");
		
		String input = in.nextLine();
		double amount = Double.parseDouble(input);
		double mToFeet = (amount * 0.3048);
		double fToMetr = (amount * 3.2808399);
		
		System.out.println("Please enter (F)eet or (M)eters: ");
		
		String choice = in.nextLine().toUpperCase();
		
		System.out.println("You've entered " + input + choice + "!");
		
		switch(choice) {
			case "F":
				System.out.println(input + " feet" + " is " + mToFeet + " meters");
				break;
			case "M":
				System.out.println(input + " meters" + "is " + fToMetr + " feet");
				break;
		}
	}
}
