package com.sabanciuniv.model;

public class Address {

	private String city;
	private String postno;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String postno) {
		super();
		this.city = city;
		this.postno = postno;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostno() {
		return postno;
	}

	public void setPostno(String postno) {
		this.postno = postno;
	}
	
	
	
}
