package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class CarTest {
	
	private Car car;
	
//	@Before
//	public void setUp() {
//		car = new Car(true);
//	}
	
	@Test
	public void is_correct_toll_given_based_on_distance() {
		car = new Car(false);
		Assert.assertEquals(0.40, car.calculateToll(20), 0.001);
	}
	
	@Test
	public void car_is_towing_a_trailer() {
		car = new Car(true);
		Assert.assertEquals(1.40, car.calculateToll(20), 0.001);
	}

}
