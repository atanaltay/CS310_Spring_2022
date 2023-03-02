package main;

public class MainClass {

	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		System.out.println("Color: " + car1.color);
		System.out.println("Speed: " + car1.currentSpeed);
		System.out.println("HP: " + car1.horsepower);
		
		
		//car1.currentSpeed = 100;
		
		System.out.println("Speed: " + car1.currentSpeed);
		
		
		car1.startEngine();
		
		car1.changeSpeed(50);
		
		car1.changeSpeed(0);
		
		car1.stopEngine();
		
		
		
	}
	
}
