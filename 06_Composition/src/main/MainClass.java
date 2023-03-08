package main;

import model.Address;
import model.Customer;
import model.Employee;

public class MainClass {

	
	public static void main(String[] args) {
		
		
		Address homeAddress = new Address(12,"Bagdat","Home");
		
		Customer customer1 = new Customer("jack", homeAddress);
		
		customer1.getInfo();
		
		System.out.println("-----------------");
		
		
		Address emp1Home = new Address(1, "Stanford", "Home");
		Address emp1Work = new Address(20, "Some street", "Work");
		
		//Address[] addresses = new Address[] {emp1Home,emp1Work};
		
		Employee emp1 = new Employee(1, "John", new Address[] {emp1Home, emp1Work});
		
		
		emp1.getInfo();
	}
	
	
}
