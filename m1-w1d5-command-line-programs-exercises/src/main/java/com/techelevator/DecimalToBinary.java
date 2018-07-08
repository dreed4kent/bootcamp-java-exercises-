package com.techelevator;

import java.util.Scanner;

/*
Write a command line program which prompts the user for a series of decimal integer values  
and displays each decimal value as itself and its binary equivalent

$ DecimalToBinary 

Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

460 in binary is 111001100
8218 in binary is 10000000011010
1 in binary is 1
31313 in binary is 111101001010001
987654321 in binary is 111010110111100110100010110001
*/
public class DecimalToBinary {

	public static void main(String[] args) {
		int number;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter a series of integers (seperated by spaces):");
		String input = in.nextLine();
		String[] inputStrings = input.split(" ");
		
		for (int i = 0; 1 < inputStrings.length; i++) {
			int intValue = Integer.parseInt(inputStrings[i]);
			String binary = "";
			while (intValue > 0) {
				if (intValue % 2 == 0) {
					binary = "0" + binary;
				} else {
					binary = "1" + binary;
				}
				intValue = intValue / 2;
			}
			System.out.println(inputStrings[i] + " in binary is " + binary);
		}

	}

}
