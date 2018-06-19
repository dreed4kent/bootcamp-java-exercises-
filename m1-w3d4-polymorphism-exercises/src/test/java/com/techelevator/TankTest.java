package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TankTest {
	
	private Tank tank;
	
	@Before
	public void setUp() {
		tank = new Tank(null);
	}
	
	@Test
	public void is_correct_toll_given_based_on_military() {
		Assert.assertEquals(0.0, tank.calculateToll(20), 0.001);
	}

}
