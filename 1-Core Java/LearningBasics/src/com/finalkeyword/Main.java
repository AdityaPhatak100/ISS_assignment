package com.finalkeyword;

/* 
 * Concepts covered: 	1. class, object, state, methods
 * 						2. final keyword, constructors
 * 					 	5. inheritance, overriding, polymorphism
 */

class Vehicle {
	String brand;
	int speedLimit;
	// final instance variable cannot be reassigned a new value
	final int numOfWheels;

	// Constructor
	Vehicle(String brand, int numOfWheels, int speedLimit) {
		this.brand = brand;
		this.numOfWheels = numOfWheels;
		this.speedLimit = speedLimit;

	}

	final public void powerOn() {
		System.out.println(this.brand + " powered on!");
	}

	public void showgasType() {
		System.out.println("Petrol / Diesel / Electric");
	}

}

class Bike extends Vehicle {

	boolean hasPaniers;

	Bike(String brand, int numOfWheels, int speedLimit, boolean hasPaniers) {
		super(brand, numOfWheels, speedLimit);
		this.hasPaniers = hasPaniers;

	}

	public void showGasType() {
		System.out.println(this.brand + " runs on Diesel.");
	}

}

// This is a final class and cannot be further extended by any other class
final class Car extends Vehicle {
	int numOfAirbags;

	Car(String brand, int numOfWheels, int speedLimit, int numOfAirbags) {
		super(brand, numOfWheels, speedLimit);
		this.numOfAirbags = numOfAirbags;
	}

	public void showGasType() {
		System.out.println(this.brand + " runs on Electricity.");
	}
}

public class Main {
	public static void main(String[] args) {

		// creating objects
		Bike ducati = new Bike("Ducati", 2, 240, false);
		Car elevate = new Car("Honda", 4, 160, 6);

		// final method cannot be overridden
		ducati.powerOn();
		elevate.powerOn();

		// non-final methods can be overridden
		ducati.showGasType();
		elevate.showGasType();

	}

}
