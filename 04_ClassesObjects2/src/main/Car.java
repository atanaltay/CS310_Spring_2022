package main;


//Java Beans
// POjO : Plain Old Java Object
public class Car {

	private String color;
	private int engineVolume;
	private int horsepower;
	private boolean engineStarted;
	private int currentSpeed;
	
	public Car() {
		
	}

	public Car(String color, int engineVolume, int horsepower, boolean engineStarted, int currentSpeed) {
		//field color is shadowed by parameter color
		//color = color;
		
		this.color = color;
		this.engineVolume = engineVolume;
		this.horsepower = horsepower;
		this.engineStarted = engineStarted;
		this.currentSpeed = currentSpeed;
	}



	public void startEngine() {
		
		if(!engineStarted) {
			engineStarted = true;
			System.out.println("Engine started");
		}else {
			System.out.println("Engine is already started!");
		}
		
	}
	
	public void changeSpeed(int speed) {
		currentSpeed = speed;
		System.out.println("Speed changed to " + currentSpeed);
	}
	
	public void stopEngine() {
		if(engineStarted) {
			engineStarted = false;
			System.out.println("Engine is stopped");
		}else {
			System.out.println("Engine is already stopped");
		}
	}
	
	//Setters and Getters
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	public int getEngineVolume() {
		return engineVolume;
	}

	public void setEngineVolume(int engineVolume) {
		this.engineVolume = engineVolume;
	}

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

	public boolean isEngineStarted() {
		return engineStarted;
	}

	public void setEngineStarted(boolean engineStarted) {
		this.engineStarted = engineStarted;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	
	
	
	
	
}
