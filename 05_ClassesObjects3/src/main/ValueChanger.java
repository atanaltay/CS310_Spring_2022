package main;

public class ValueChanger {
		
	public void changeValue(int number) {
		
		number+=200;
		
		
	}
	
	// method signature methodName(int,double,int)
	
	//changeValue is overloaded
	public int changeValue(int number,boolean check) {
		
		number+=200;
		return number;
		
	}
	
	
	
	
}
