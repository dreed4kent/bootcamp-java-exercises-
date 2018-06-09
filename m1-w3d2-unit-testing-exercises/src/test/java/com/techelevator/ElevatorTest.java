package com.techelevator;

import org.junit.Before;
import org.junit.Test;

public class ElevatorTest {
	
	private Elevator elevator;
	
	@Before
	public void setup( ) {
		elevator = new Elevator(1, 20);
	}
	
	@Test
	public void unintended_side_effects_calling_methods() {
		
	}

}
