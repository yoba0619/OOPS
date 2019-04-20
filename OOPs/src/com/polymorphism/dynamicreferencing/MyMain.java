package com.polymorphism.dynamicreferencing;

public class MyMain {

	public static void main(String[] args) {
		VehicleService service = new VehicleService();
		Vehicle vehicle = service.search(2, 2);
		System.out.println(vehicle.type());

	}

}
