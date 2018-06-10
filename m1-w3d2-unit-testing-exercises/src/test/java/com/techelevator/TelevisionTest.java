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
	public void does_volume_correctly_reset() {
		television.TurnOff();
		television.TurnOn();
		Assert.assertEquals(2, television.getCurrentVolume());
	}
	
	@Test
	public void unexpected_side_effects_changing_channel() {
		television.IsOn();
		television.ChangeChannel(19);
		television.getSelectedChannel();
		Assert.assertEquals(19, television.getSelectedChannel());
	}
	
	@Test
	public void unexpected_side_effects_turn_off_on() {
		television.TurnOff();
		television.TurnOn();
		television.getCurrentVolume();
		Assert.assertEquals(3, television.getCurrentVolume());
	}

}
