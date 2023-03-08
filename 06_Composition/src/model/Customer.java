package model;


//Domain Object
//Entity Object
//Model Objects
public class Customer {
	
	private String name;
	private Address address;
	
	public Customer() {
		
	}
	
	
	public void getInfo() {
		System.out.println("Customer:" + name);
		
		address.getInfo();
		
	}

	public Customer(String name, Address address) {

		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	

}
