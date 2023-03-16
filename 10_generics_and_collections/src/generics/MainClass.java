package generics;

public class MainClass {

	public static void main(String[] args) {
		
		TypeBox<String,Integer> typeBox = new TypeBox<>();
		
		typeBox.setVar("altug");
		
		
		//Types of generic MUST be reference types
		// int - > Integer
		// double -> Double
		//boolean -> Boolean
		
		//String numStr = "5";
		
		//int num =  Integer.valueOf(numStr);
		
		//String s = String.valueOf(5);
		
		TypeBox<Integer,String> intBox = new TypeBox<>();
		
		intBox.setVar(3);
		
		System.out.println(typeBox.getVar().getClass());
		System.out.println(intBox.getVar().getClass());
		
		
		
	}
	
	
	
}
