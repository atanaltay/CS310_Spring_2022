package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainCLass {

	public static void main(String[] args) {
		
		//Basic char write operation
		/*
		try(
				//writer will be closed automatically
				BufferedWriter writer = 
				new BufferedWriter(
						new FileWriter("/Users/atanaltay/Desktop/test.txt"));
		
				) {
			
			
			
			writer.write("some text some text \n some more text..");
			
			writer.flush();
			
			System.out.println("Write complete!!");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		*/
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("/Users/atanaltay/Desktop/test.txt"));
		
			String line ="";
			StringBuilder buffer = new StringBuilder();
			while((line= reader.readLine())!=null) {
				
				buffer.append(line + "\n");
				
				
			}
			
			System.out.print(buffer.toString());
		
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	
	
}
