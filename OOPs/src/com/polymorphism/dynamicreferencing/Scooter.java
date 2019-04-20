package com.polymorphism.dynamicreferencing;

public class Scooter implements Vehicle{

	@Override
	public int engine() {
		return 2;
	}

	@Override
	public int tires() {
		return 2;
	}

	@Override
	public String type() {
		// TODO Auto-generated method stub
		return "Scooter";
	}
	
}
