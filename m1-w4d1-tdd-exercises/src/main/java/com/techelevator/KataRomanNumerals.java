package com.techelevator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KataRomanNumerals {

	
	//private Integer [] numsArray = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
	private Integer [] numsArray = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	//private String [] stringArray = {"I","IV","V","IX","X","IL","L", "IC","C", "ID","D", "IM","M"};
	private String [] stringArray = {"M","CM","D","CD","C","IC","L", "IL","X", "IX","V","IV","I"};
	
	public String convert(int number){
//		Map <Integer,String> nums = new HashMap<Integer,String>();
//		List <String> results = new ArrayList<String>();
				
//		while(number % 1000 == 0){
//			results.add("M");
//			number /= 1000;
//		} return results;
//	}}
		
		String result = new String();
		for(int i = 0; i<numsArray.length; i++){
			while(number>=numsArray[i]){
				result+= stringArray[i];
				number-=numsArray[i];
			}
		}return result;
	}
}

	
//		if (nums.containsKey(number)){
//			 result = nums.get(number);
//		}else {
//			result = "else";
//		}return result;
//	}
