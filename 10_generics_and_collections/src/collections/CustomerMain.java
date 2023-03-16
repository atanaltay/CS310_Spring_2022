package collections;

import java.util.ArrayList;
import java.util.List;

public class CustomerMain {

	public static void main(String[] args) {
		
		Address home = new Address("ISTANBUL");
		
		Address work = new Address("ISTANBUL");
		
		List<Address> addresses = new ArrayList<>();
		
		addresses.add(home);
		addresses.add(work);
		
		
		Customer customer = new Customer("jack", addresses);
		
		
		System.out.println("Name:" + customer.getName());
		
		System.out.println("Addresses:" + customer.getAddresses());
		
		
		
		
		
	}
	
	
}
