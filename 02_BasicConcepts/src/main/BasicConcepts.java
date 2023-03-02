package main;

import java.util.Scanner;

public class BasicConcepts {
	
	public static void main(String[] args) {
		
		
		//Variables
		//byte, short, int 
		//float, double
		//boolean
		//char -> 16 bits
		
		int x = 12;
		int y = 15;
		
		int sum = x+y;
		
		System.out.println(sum);
		
		
		double dNum = 12.3;
		
		//Implicit casting
		dNum = x + y;
		
		//add larger types and get a smaller type result
		// double + double ? = int
		
		double d1 = 12.2;
		double d2 = 23.3;
		
		//explicit casting
		//precision might be lost!
		int result = (int)(d1+d2);
		
		System.out.println(result);
		
		//Strings 
		//Strings are reference types but act like primitive types!
		String firstName = "altug";
		String lastName = " tanaltay";
		
		System.out.println(firstName + lastName);
		
		//Getting console input 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What's your name?");
		
		String name = input.nextLine();
		
		System.out.println("Hello " + name);
		
		boolean check = true;
		
		byte b1 = 10;
		byte b2 = 13;
		
		//any integer int sized smaller is an int 
		//code below creates a compiler error
		//byte byteSum = b1+b2;
		
		byte byteSum = (byte)(b1+b2);
		
		//Controls and condition
		//< > <= >=  ! (not)
		// else if
		
		//short circuit operators
		// and -> &&
		// or -> ||
		
		if(b1>11 && ++b2<14) {
			System.out.println("greater");
		}else {
			System.out.println("less");
		}
		
		System.out.println(b2);
		
		//Primitive type assignments
		//when their values are assing they are COPIED
		
		
		int x1 = 12;
		int x2 = x1;
		
		x1++;
		
		System.out.println("x1:" +x1);
		System.out.println("x2:" +x2);
		
		
		//their size is fixed!
		String[] names = {"altug","jack","john","henry"};
		
		int[] numbers = new int[3];
		
		numbers[0] =2;
		numbers[1] =3;
		numbers[2] =4;
		
		
		System.out.println(names[1]);
		
		//incrementor for loop
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		
		for (String name_ : names) {
			System.out.println(name_);
		}
		
		
		//while
		
		int incrementor = 0;
		while(incrementor <numbers.length) {
			
			System.out.println(numbers[incrementor]);
			incrementor++;
		}
		
	}

}
