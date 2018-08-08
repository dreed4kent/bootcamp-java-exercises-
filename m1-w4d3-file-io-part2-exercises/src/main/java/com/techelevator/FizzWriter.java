package com.techelevator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FizzWriter {

	public static void main(String[] args) {
		
		PrintWriter fileOutput = null;
		
		try {
			fileOutput = new PrintWriter(new FileOutputStream("FizzBuzz.txt"));
			String value = "";
			for (int i = 0; i <= 300; i++) {
				if (i % 3 == 0 && i % 5 == 0 && i != 0) {
					value = "FizzBuzz";
				} else if (i % 3 == 0 && i != 0) {
					value = "Fizz";
				} else if (i % 5 == 0 && i != 0) {
					value = "Buzz";
				} else {
					value = Integer.toString(i);
					
					fileOutput.println(value);
					fileOutput.flush();
				}
			}
				fileOutput.flush();
			} catch (FileNotFoundException e) {
				System.out.println("Could Not Open file");
				System.exit(1);
			} finally {
				fileOutput.close();
			}

	}

}
