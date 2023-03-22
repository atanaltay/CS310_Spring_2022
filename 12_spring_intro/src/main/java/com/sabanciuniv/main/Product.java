package com.sabanciuniv.main;

//Entity
public class Product {
	
	
	private String name;
	private double price;
	
	
	public Product() {
		// TODO Auto-generated constructor stub
	}


	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
