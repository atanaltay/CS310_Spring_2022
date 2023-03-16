package collections;

import java.util.List;

public class Customer {

	private String name;
	
	private List<Address> addresses;

	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Customer(String name, List<Address> addresses) {
		super();
		this.name = name;
		this.addresses = addresses;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public List<Address> getAddresses() {
		return addresses;
	}


	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
	
	
}
