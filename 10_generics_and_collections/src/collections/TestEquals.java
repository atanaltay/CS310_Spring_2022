package collections;

public class TestEquals {

	public static void main(String[] args) {
		
		Product prod3 = new Product(3,"Mouse");
		Product prod4 = new Product(3,"Mouse");
		
		
		if(prod3 == prod4) {
			System.out.println("Same");
		}else {
			System.out.println("Not same");
		}
		
		System.out.println("--------------");
		if(prod3.equals(prod4)) {
			System.out.println("Same");
		}else {
			System.out.println("Not same");
		}
		
		
	}
	
	
	
}
