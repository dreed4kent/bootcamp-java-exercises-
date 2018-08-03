package com.techelevator;

public class KataRomanNumerals {
	String[] romanArray = {"M", "CM", "D", "C", "L", "X", "IX", "V", "IV", "I"};
	int[] numbersArray = {1000, 900, 500, 100, 50, 10, 9, 5, 4, 1};
	
	public String numeralToRoman(int number) {
		int n = number;
		String roman = "";
		
		for(int i = 0; i < numbersArray.length; i++) {
			while(n >= numbersArray[i]) {
				roman += romanArray[i];
				n -= numbersArray[i];
			}
		}
		return roman;
	}
	
	public int romanToNumeral(String roman) {
		int numeral = 0;
		while(!roman.isEmpty()){
			if(roman.length() == 1) {
				for(int i = 0; i < romanArray.length; i++) {
					if(roman.equals(romanArray[i])) {
						numeral += numbersArray[i];
						roman = "";
						break;
					}
				}
				
			}
			if(roman.length() >= 2) {
				for(int i = 0; i < romanArray.length; i++) {
					if(roman.substring(0,2).equals(romanArray[i])){
						numeral += numbersArray[i];
						roman = roman.substring(2);
						break;
					}
				}
			}
			
			if(roman.length() >= 1) {
				for(int i = 0; i < romanArray.length; i++) {
					if(roman.substring(0,1).equals(romanArray[i])) {
						numeral += numbersArray[i];
						roman = roman.substring(1);
						break;
					}
				}
			}
			
		}
		
		return numeral;
	}
	
}