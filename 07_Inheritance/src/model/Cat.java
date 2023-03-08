package model;

public class Cat extends Animal{
	
	private String catType;

	
	@Override
	public void makeSound() {
		System.out.println("Miyaoooewww");
	}
	
	
	public Cat(String furColor, String habitat, String catType) {
		super(furColor, habitat);
		System.out.println("Cat constructor");
		this.catType = catType;
	}


	public void getInfo() {
		System.out.println("Cat:" + catType);
		
		super.getInfo();
			
	
	}
	
	
	public String getCatType() {
		return catType;
	}

	public void setCatType(String catType) {
		this.catType = catType;
	}
	
	
	
	
	

}
