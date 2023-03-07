package main;

public class ManClass {

	public static void main(String[] args) {
		
		//Person p1 = new Person();
		
		Person p2 = new Person("mehmet");
		
		System.out.println(p2.name);
		
		Car car1 = new Car();
		
		
		//car1.color = "blue";
		
		Car car2 
		= new Car("Black", 100, 100, false, 100);
		
		
		car2.changeSpeed(120);
	}
	
	
	
}
