package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class TelevisionTest {
	
	private Television television;
	
	@Before
	public void setup( ) {
		television = new Television();
	}
	
	@Test
	public void boundaries_on_the_volume() {
		television.LowerVolume();
		Assert.assertEquals(0, television.getCurrentVolume());
	}
	
	@Test
	public void side_effects_changing_channel() {
		television.TurnOff();
		television.TurnOn();
		Assert.assertEquals(2, television.getCurrentVolume());
	}

}
