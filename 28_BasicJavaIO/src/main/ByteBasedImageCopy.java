package main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteBasedImageCopy {

	public static void main(String[] args) {
		
		
		try(
				BufferedInputStream reader 
				= new BufferedInputStream(
						new FileInputStream("/Users/atanaltay/Desktop/java_logo.png"
								));
				
				BufferedOutputStream wrtier 
				= new BufferedOutputStream(
						new FileOutputStream("/Users/atanaltay/Desktop/java_logo_copy.png")
						);
				
				
				) {
			
			int b = 0;
			while((b=reader.read())!=-1) {
				
				wrtier.write((byte)b);
				
			}
			wrtier.flush();
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
}
