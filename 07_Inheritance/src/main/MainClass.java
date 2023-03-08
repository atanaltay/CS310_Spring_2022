package main;

import javax.swing.plaf.synth.SynthScrollBarUI;

import model.Animal;
import model.Cat;
import model.Lion;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		Cat cat1 = new Cat();
		cat1.setCatType("House");
		cat1.setFurColor("Gray");
		cat1.setHabitat("City");
		
		cat1.getInfo();
		
		*/
		
		//Intro to polymorphism
		
		//Lion lion1 = new Lion("yellow", "forest", "Wild", "Africa");
		
		
		
		Animal cat1 = new Cat("yellow", "house", "house");
		System.out.println("------Cat");
		cat1.makeSound();
		//Cat lion2 = new Lion("yellow", "wild", "forest", "Africa");
		
		//System.out.println("------lion");
		//lion1.makeSound();
		
		
		
		//System.out.println("------Cat");
		//lion2.makeSound();
		
	}
	
	
	
	
	
}
