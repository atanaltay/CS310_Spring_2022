package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {

	
	public static void main(String[] args) {
		
		Map<String, String> namesMap = new HashMap<>();
		
		namesMap.put("name1", "altug");
		namesMap.put("name2", "jack");
		namesMap.put("name2", "john");
		
		namesMap.put("name3", "henry");
		namesMap.put("name4", "william");
		
		System.out.println("--------------------");
		
		System.out.println(namesMap.get("name2"));
		
		//returns a set of strings
		//namesMap.keySet()
		
		for (String key : namesMap.keySet()) {
			System.out.println("key:" + key + ", value:" +   namesMap.get(key));
		}
		
		
		System.out.println("------------------");
		
		List<Product> clothing = new ArrayList<>();
			clothing.add(new Product(1,"shoes"));
			clothing.add(new Product(2,"trousers"));
		
		List<Product> tech = new ArrayList<>();
			tech.add(new Product(3,"TV"));
			tech.add(new Product(4,"laptop"));
			tech.add(new Product(5,"mouse"));
			
			
		Map<String, List<Product>> prodsMap = new HashMap<>();
		
		prodsMap.put("clothing", clothing);
		prodsMap.put("tech", tech);
		
		
		for (String key : prodsMap.keySet()) {
			
			System.out.println("Category:" + key);
			
			for (Product product : prodsMap.get(key)) {
				System.out.println("\t" + product);
			}
			
			
			
		}
		
		
		
	}
	
	
}
