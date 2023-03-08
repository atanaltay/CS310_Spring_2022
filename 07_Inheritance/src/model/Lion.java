package model;

public class Lion extends Cat{

	private String continent;
	
	
	@Override
	public void makeSound() {
		System.out.println("Roarrrrrr!!");
	}

	public Lion(String furColor, String habitat, String catType, String continent) {
		super(furColor, habitat, catType);
		System.out.println("Lion constructor");
		this.continent = continent;
	}
	
	public void getInfo() {
		System.out.println("Lion:" + continent );
		super.getInfo();
		
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}
	
	public String getContinent() {
		return continent;
	}
	
	
}
