package main;

public class Car2 {

	String color;
	int engineVolume;
	int horsepower;
	boolean engineStarted;
	
	int currentSpeed;
	
	
	//Default constructor of a class
	// no-arg constructor
	public Car2() {
		color="blue";
		engineVolume = 1200;
		horsepower=120;
		engineStarted = false;
		
		currentSpeed = 0;
	}
	
	
	//COnstructor overloading
	//Adding constructors with different sets of arguments
	//Non-default constructor
	public Car2(String _color, int _engineVolume) {
		color = _color;
		engineVolume = _engineVolume;
	}
	
	
	
	
	
	public Car2(String color, int engineVolume, int horsepower, boolean engineStarted, int currentSpeed) {
		//shadowing, variable value is assigned to itself
		//color = color;
		this.color = color;
		this.engineVolume = engineVolume;
		this.horsepower = horsepower;
		this.engineStarted = engineStarted;
		this.currentSpeed = currentSpeed;
	}


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
