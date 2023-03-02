package main;

public class Car {

	//instance variables
	// fields
	// global variables of a class
	
	// if no values are assigned
	//variable get their default values
	// numeric -> 0
	//boleans -> false
	//String or refence types -> null
	String color="blue";
	int engineVolume = 1200;
	int horsepower=120;
	boolean engineStarted = false;
	
	int currentSpeed = 0;
	

	void startEngine() {
		
		if(!engineStarted) {
			engineStarted = true;
			System.out.println("Engine started");
		}else {
			System.out.println("Engine is already started!");
		}
		
	}
	
	void changeSpeed(int speed) {
		currentSpeed = speed;
		System.out.println("Speed changed to " + currentSpeed);
	}
	
	void stopEngine() {
		if(engineStarted) {
			engineStarted = false;
			System.out.println("Engine is stopped");
		}else {
			System.out.println("Engine is already stopped");
		}
	}
	
	
}
