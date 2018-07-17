package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class KataPrimeFactors {
	
	public List<String> factorize(int number) {
		
		List<String> factorList = new ArrayList<String>();
		
		for (int i = 2; i <= number; i++) {
			while (number % i == 0) {
				factorList.add(Integer.toString(i));
				number /= i;
			}
		}
		return factorList;
	}

}
