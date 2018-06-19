package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class TruckTest {
	
	private Truck truck;
	
//	@Before
//	public void setUp() {
//		truck = new Truck(4, 1);	// ( numbeOfAxels, ratePerMile )
//	}
	
	@Test
	public void axles_4() {
		truck = new Truck(4, 1);
		Assert.assertEquals(0.40, truck.calculateToll(10), 0.001);
	}
	
	@Test
	public void axles_6() {
		truck = new Truck(6, 1);
		Assert.assertEquals(0.45, truck.calculateToll(10), 0.001);
	}
	
	@Test
	public void axles_8() {
		truck = new Truck(8, 1);
		Assert.assertEquals(0.48, truck.calculateToll(10), 0.001);
	}

}
