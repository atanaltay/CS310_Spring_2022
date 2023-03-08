package main;

public class MainClass {

	
	public static void main(String[] args) {
		
		//Primitive type assignment
		int x = 12;
		int y = x;
		
		x++;
		
		System.out.println("x:" + x);
		System.out.println("y:" + y);
		
		
		//Reference type assignments
		
		
		Car myCar = new Car("blue", 120, 1000, false, 0);
		
		
		Car mySecondCar = myCar;
		
		
		myCar.setColor("Redd");
		
		System.out.println("MyCar:" + myCar.getColor());
		
		System.out.println("MySecondCar:" + mySecondCar.getColor());
		
		
		
		//some more code 
		
		myCar = null;
		mySecondCar = null;
		//as the Car() object doesnt have a reference
		// it will be cleared by GC
		
		//System.gc();
		//System.exit(0);
		
		
		
		
		
	}
	
	
}
