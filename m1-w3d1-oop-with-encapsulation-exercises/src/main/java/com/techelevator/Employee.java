package com.techelevator;

public class Employee {
	
	// m e m b e r   v a r i a b l e s
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private String department;
	private double annualSalary;
	
	public String getFullName() {
		return (lastName + ", " + firstName);
	}

	
	// c o n s t r u c t o r
	
	public Employee(int employeeId, String firstName, String lastName, double salary) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.annualSalary = salary;
	}
	
	// g e t t e r s / s e t t e r s

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public double getAnnualSalary() {
		return annualSalary;
	}
	
	// m e t h o d
	
	public void raiseSalary(double percent) {
		double raise = annualSalary * percent / 100;
		annualSalary += raise;
	}
	
}
