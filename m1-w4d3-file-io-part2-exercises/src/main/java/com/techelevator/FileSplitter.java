package com.techelevator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileSplitter {

	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
        System.out.println("What file would you like to split ");
        String filePath = userInput.nextLine();
        
        System.out.println("How many lines per file");
        int lineCount = userInput.nextInt();
        Scanner fileInput = null;
        PrintWriter fileOutput = null;
        try {
			fileInput = new Scanner(new FileInputStream(filePath));
			
			String newFileName =createFileName(filePath, 1)	;		
			fileOutput = new PrintWriter(new FileOutputStream(newFileName));
			
			int linesRead = 0;
			int filesMade = 1;
			while(fileInput.hasNext()) {
				linesRead++;
				String line = fileInput.nextLine();
				fileOutput.println(line);
				
				
				if (linesRead >= lineCount) {
					linesRead = 0;
					newFileName =createFileName(filePath, ++filesMade)	;	
					fileOutput.flush();
					fileOutput = new PrintWriter(new FileOutputStream(newFileName));
				}
			}
		fileOutput.flush();	
		
		} catch (FileNotFoundException e) {
			System.out.println("Failed to open file at " + filePath);
			System.exit(1);
			//e.printStackTrace();
		} finally {
			userInput.close();
			fileInput.close();
			fileOutput.close();
		}
	}
	private static String createFileName(String path, int index) {
		File fileToRead = new File(path);
		String oldFileName = fileToRead.getName();
		int lastDotIndex = oldFileName.lastIndexOf('.');
		String newFileName = oldFileName.substring(0, lastDotIndex);
		newFileName = newFileName + "-"+index + oldFileName.substring(lastDotIndex);
		
		return newFileName;
	}
	
}