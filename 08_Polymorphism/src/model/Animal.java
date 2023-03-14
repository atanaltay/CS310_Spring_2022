package model;

//All classes in Java implicitly
//extend from Object class
public abstract class Animal{
	
	private String furColor;
	private String habitat;
	
	
	public abstract void makeSound();
	
	
	public abstract void feedAnimal();

	public Animal(String furColor, String habitat) {
		System.out.println("Animal constructor");
		this.furColor = furColor;
		this.habitat = habitat;
	}


	public void getInfo() {
		System.out.println("Animal:" + furColor);
		System.out.println("Animal:" + habitat);
	}
	
	
	public String getFurColor() {
		return furColor;
	}
	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	
	
	

}
