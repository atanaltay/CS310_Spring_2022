package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MainCLass {

	public static void main(String[] args) {
		
		//Basic char write operation
		
		try(
				//wrtierwill be closed automatically
				BufferedWriter writer = 
				new BufferedWriter(
						new FileWriter("test.txt"));
		
				) {
			
			
			
			writer.write("some text some text \n some more text..");
			
			writer.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
	
	
}
