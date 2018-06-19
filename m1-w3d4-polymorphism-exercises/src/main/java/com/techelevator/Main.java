package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
	List<Vehicle> allVehicles = new ArrayList<Vehicle>();
		allVehicles.add(new Car("Car", 20, 0.50));
		allVehicles.add(new Truck("Truck", 20, 0.60));
//		allVehicles.add(new Tank("Tank", 20, 0.70));
		
		System.out.println("Vehicle        Distance       Toll $");
		for(Vehicle vehicles : allVehicles) {
			int distance = 10;
			vehicles.calculateToll(distance);
			System.out.println(Vehicle.class + ", " + distance + vehicles.calculateToll(distance));
		}
	} 

}
