package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class HomeworkAssignmentTest {
	
	private HomeworkAssignment homeworkAssignment;
	
	@Before
	public void setUp() {
		homeworkAssignment = new HomeworkAssignment(100);
	}
	
	@Test
	public void does_correct_grade_get_returned() {
		homeworkAssignment.getTotalMarks();
		homeworkAssignment.getPossibleMarks();
		Assert.assertEquals(100, homeworkAssignment.getPossibleMarks());
	}
	
	@Test
	public void incorrect_grade_get_returned() {
		homeworkAssignment.getTotalMarks();
		homeworkAssignment.getPossibleMarks();
		Assert.assertEquals(80, homeworkAssignment.getPossibleMarks());
	}

}
