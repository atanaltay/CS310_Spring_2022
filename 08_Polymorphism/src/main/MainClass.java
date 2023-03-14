package main;

import model.Animal;
import model.Cat;
import model.Chef;
import model.Chicken;
import model.Dog;
import model.Lion;
import model.ZooKeeper;

public class MainClass {

	public static void main(String[] args) {
		
		Animal anim1 = new Cat("black", "", "house");
		
		Animal anim2 = new Dog("brown", "house");
		
		
		anim1.makeSound();
		
		
		anim2.makeSound();
		
		System.out.println("----------------");
		
		ZooKeeper zooKeeper = new ZooKeeper();
		
		zooKeeper.feedAnimal(anim1);
		zooKeeper.feedAnimal(anim2);
		
		zooKeeper.feedAnimal(new Lion("", "", "", ""));
		
		zooKeeper.feedAnimals(new Animal[] {anim1,anim2});
		
		zooKeeper.feedAnimal(new Chicken(null, null));
		
		
		System.out.println("---------------");
		
		Chef chef = new Chef();
		
		Chicken chicken = new Chicken(null, null);
		
		chef.cook(chicken);
		
		//chef.cook(new Lion(null, null, null, null));
		
	}
	
	
	
	
	
}
