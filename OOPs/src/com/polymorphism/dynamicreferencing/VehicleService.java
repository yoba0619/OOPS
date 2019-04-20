package com.polymorphism.dynamicreferencing;

public class VehicleService {
	public Vehicle search(int engineCapacity, int noOfTires) {
		Vehicle vehicle = null;
		if(engineCapacity == 2 && noOfTires == 2) {
			vehicle = new Scooter();
		}else if(engineCapacity == 4 && noOfTires == 4) {
			vehicle = new Car();
		}
		return vehicle;
	}

}
