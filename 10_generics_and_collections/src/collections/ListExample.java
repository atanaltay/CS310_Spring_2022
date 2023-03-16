package collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	
	public static void main(String[] args) {
		
		//ordered, accept non unique elements
		//implementations are ArrayList, LinkedList, Vector (dont use it)
		List<String> names = new ArrayList<>();
		
		names.add("jack");
		names.add("henry");
		names.add("william");
		names.add("john");
		
		System.out.println(names.get(0));
		
		System.out.println("------------");
		
		for (String name : names) {
			System.out.println(name);
		}
		
	}
	
	
	
}
