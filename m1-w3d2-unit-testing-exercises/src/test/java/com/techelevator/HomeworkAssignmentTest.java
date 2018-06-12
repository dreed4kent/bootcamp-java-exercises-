package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class HomeworkAssignmentTest {
	
	private HomeworkAssignment homeworkAssignment;
	
	@Before
	public void setUp() {
		homeworkAssignment = new HomeworkAssignment(99);
	}
	
	@Test
	public void does_correct_grade_get_returned() {
		homeworkAssignment.getLetterGrade();
		homeworkAssignment.getTotalMarks();
		homeworkAssignment.getPossibleMarks();
		Assert.assertEquals(99, homeworkAssignment.getPossibleMarks());
	}
	
	@Test
	public void incorrect_grade_get_returned() {
		homeworkAssignment.getTotalMarks();
		homeworkAssignment.getPossibleMarks();
		Assert.assertEquals(80, homeworkAssignment.getLetterGrade());
	}
	
	@Test
	public void incorrect_value_for_total_marks() {
		homeworkAssignment.setTotalMarks(88);
		Assert.assertEquals(99, homeworkAssignment.getTotalMarks());
	}

}
