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
		elevator.CloseDoor();
		elevator.GoUp(21);
		Assert.assertEquals(false, elevator.getCurrentLevel());
	}
	
	@Test
	public void moving_when_doors_opened() {
		elevator.OpenDoor();

		Assert.assertEquals(false, elevator.isMoving());
	}
	
	@Test
	public void moving_when_doors_closed() {
		elevator.CloseDoor();;
		Assert.assertEquals(true, elevator.isMoving());
	}
	
	@Test
	public void unintended_consequences_when_calling_methods() {
		elevator.isMoving();
		Assert.assertEquals(true, elevator.isDoorOpen());
	}

}
