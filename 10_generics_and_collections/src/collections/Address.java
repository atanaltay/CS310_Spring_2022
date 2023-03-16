package collections;

public class Address {

	private String city;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return city;
	}
	
	
	public Address(String city) {
		super();
		this.city = city;
	}



	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
}
