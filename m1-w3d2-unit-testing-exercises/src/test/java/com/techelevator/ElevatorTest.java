package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class ElevatorTest {
	
	private Elevator elevator;
	
	@Before
	public void setup( ) {
		elevator = new Elevator(1, 20);
	}
	
	@Test
	public void going_up_past_ceiling() {
		Assert.assertTrue(elevator.GoUp(21));
		Assert.assertEquals(true, elevator.getCurrentLevel());
	}
	
	@Test
	public void moving_when_doors_opened() {
		Assert.assertTrue(elevator.isDoorOpen());
		Assert.assertEquals(true, elevator.isMoving());
	}
	
	@Test
	public void unintended_consequences_when_calling_methods() {
		Assert.assertFalse(elevator.isMoving());
		Assert.assertEquals(false, elevator.isDoorOpen());
	}

}
