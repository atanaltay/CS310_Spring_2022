package collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		
		Set<String> namesSet = new HashSet<>();
		
		namesSet.add("jack");
		namesSet.add("jack");
		namesSet.add("john");
		namesSet.add("ali");
		namesSet.add("ahmet");
		namesSet.add("zeynep");
		
		for (String name : namesSet) {
			System.out.println(name);
		}
		
		System.out.println("----------------------");
		
		
		Product prod1 = new Product(1,"TV");
		Product prod2 = new Product(2,"Laptop");
		Product prod3 = new Product(3,"Mouse");
		Product prod4 = new Product(3,"Mouse");
		
		
		Set<Product> products = new HashSet<>();
		
		products.add(prod1);
		products.add(prod2);
		products.add(prod3);
		products.add(prod4);
		

		for (Product product : products) {
			System.out.println(product);
		}
		
	}
	
	
	
}
