package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	
	private Employee employee;
	
	@Before
	public void setup( ) {
		employee = new Employee(420, "Willie", "Nelson", 100000);
	}
	
	@Test
	public void salary_correct_after_raise() {
		employee.RaiseSalary(15.0);
		Assert.assertEquals(115000, employee.getAnnualSalary(), 0.0001);
	}
	
	@Test
	public void salary_possible_if_negative() {
		employee.RaiseSalary(-15.0);
		Assert.assertEquals(115000, employee.getAnnualSalary(), 0.0001);
	}

}
