package main;

public class PassByRefAndVal {

	public static void main(String[] args) {
		
		Car myCar = new Car("blue", 120, 1000, false, 0);
		
		
		
		CarPainter painter = new CarPainter();
		
		
		//Pass by reference
		painter.paintCar(myCar, "red");
		
		
		System.out.println("Color is " + myCar.getColor()) ;
		
		
		//Pass By Value
		int x = 20;
		
		ValueChanger valChanger = new ValueChanger();
		
		valChanger.changeValue(x);
		
		
		System.out.println("x: " + x);
		
		System.out.println("x: " + valChanger.changeValue(x, false));
		
		
	}
	
	
	
	
}
