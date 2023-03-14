package model;

public class ZooKeeper {

	public void feedAnimal(Animal animal) {
		animal.feedAnimal();
	}
	
	
	public void feedAnimals(Animal[] anims) {
		for (Animal animal : anims) {
			animal.feedAnimal();
		}
	}
	
	
	
	
	
}
