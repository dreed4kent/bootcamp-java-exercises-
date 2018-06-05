package com.techelevator;

public class HomeworkAssignment {
	
	private int totalMarks;
	private int possibleMarks;
	private String submitterName;

	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public String getSubmitterName() {
		return submitterName;
	}

	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}

	public int getPossibleMarks() {
		return possibleMarks;
	}
	
	public String getLetterGrade() {
		double yourGrade = ((double)this.totalMarks/(double)this.possibleMarks) * 100;
		
		if (yourGrade >= 90) {
			return "A";
		} else if (yourGrade >= 80){
			return "B";
		} else if (yourGrade >= 70) {
			return "C";	
		} else if (yourGrade >= 60) {
			return "D";
		} else {
			return "F";
		}
	}


}
