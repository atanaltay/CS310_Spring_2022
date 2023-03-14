package model;

public class Dog extends Animal{

	public Dog(String furColor, String habitat) {
		super(furColor, habitat);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void feedAnimal() {
		System.out.println("Dog is fed...");
	}
	
	
	public void makeSound() {
		System.out.println("Bark bark...");
	}

	
	
	
	
}
