package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AirplaneTest {
	
	private Airplane airplane;
	
	@Before
	public void setup( ) {
		airplane = new Airplane(100, 200);
	}
	
	@Test
	public void overbooked_seats() {
		boolean success = airplane.Reserve(true, 101);
		Assert.assertFalse(success);
		Assert.assertFalse(airplane.Reserve(false, 201));
	}
	
	@Test
	public void are_available_seats_accurate() {
		boolean success = airplane.Reserve(true, 10);
		Assert.assertTrue(success);
		Assert.assertTrue(airplane.Reserve(true, 10));	//this line replaced the top 2 above it
		Assert.assertTrue(airplane.Reserve(false, 10));
		Assert.assertEquals(190, airplane.getAvailableCoachSeats());
		Assert.assertEquals(90, airplane.getAvailableFirstClassSeats());
	}
	
	@Test
	public void accurate_count_after_booking() {
		Assert.assertTrue(airplane.Reserve(true, 10));
		Assert.assertTrue(airplane.Reserve(false, 10));
		Assert.assertEquals(10, airplane.getBookedCoachSeats());
		Assert.assertEquals(10, airplane.getAvailableFirstClassSeats());
	}

}
