package model;

public class Employee {
	
	private int id;
	private String name;
	private Address[] addresses;
	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}


	public Employee(int id, String name, Address[] addresses) {
		super();
		this.id = id;
		this.name = name;
		this.addresses = addresses;
	}
	
	public void getInfo() {
		System.out.println("Employee:" + name);
		System.out.println("ID:" + id);
		
		for (Address address : addresses) {
			address.getInfo();
		}
		
	
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Address[] getAddresses() {
		return addresses;
	}


	public void setAddresses(Address[] addresses) {
		this.addresses = addresses;
	}
	
	
	
	
}
