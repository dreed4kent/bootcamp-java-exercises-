package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class SmartPhoneTest {
	
	private SmartPhone smartPhone;
	
	@Before
	public void setUp( ) {
		smartPhone = new SmartPhone("1234567890", "Verizon");
	}
	
	@Test
	public void does_battery_recharge_to_100() {
		Assert.assertEquals(95, smartPhone.getBatteryCharge());
	}
	
	@Test
	public void methods_changed_when_called() {
		smartPhone.Call(null, 5);
		smartPhone.getBatteryCharge();
		Assert.assertEquals(95, smartPhone.getBatteryCharge());
	}
	
	@Test
	public void possible_to_spend_too_long_talking() {
		smartPhone.isOnCall();
		smartPhone.getBatteryCharge();
		Assert.assertEquals(0, smartPhone.getBatteryCharge());
	}
	
	@Test
	public void dial_number_only_7_digits() {
		smartPhone.getPhoneNumber();
		Assert.assertEquals(1234567, smartPhone.getPhoneNumber());
	}

}
