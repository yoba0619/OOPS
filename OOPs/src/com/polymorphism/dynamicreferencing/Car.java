package com.polymorphism.dynamicreferencing;

public class Car implements Vehicle{

	@Override
	public int engine() {
		return 4;
	}

	@Override
	public int tires() {
		return 4;
	}

	@Override
	public String type() {
		return "Car";
	}
	
}
