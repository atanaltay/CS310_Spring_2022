package model;

public class Address {

	private int doorNo;
	private String street;
	private String addressType;
	
	
	public Address() {
	
	}


	public Address(int doorNo, String street, String addressType) {

		this.doorNo = doorNo;
		this.street = street;
		this.addressType = addressType;
	}

	public void getInfo() {
		System.out.println("Address:");
		System.out.println("Door:" + doorNo);
		System.out.println("Street:" + street);
		System.out.println("Type:" + addressType);
	}
	
	

	public int getDoorNo() {
		return doorNo;
	}


	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getAddressType() {
		return addressType;
	}


	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}
	
	
	
	
	
	
	
}
