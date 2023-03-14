package model;

public class Chicken extends Animal implements Eatable{

	public Chicken(String furColor, String habitat) {
		super(furColor, habitat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		System.out.println("git git..");
		
	}

	@Override
	public void feedAnimal() {
		System.out.println("The chicken is fed..");
		
	}

	@Override
	public void howToEat() {
		System.out.println("Boil and make a soup");
		
	}

}
