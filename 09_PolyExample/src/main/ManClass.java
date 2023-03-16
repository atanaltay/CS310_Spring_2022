package main;

public class ManClass {

	public static void main(String[] args) {
		
		LegalDoc doc1 = new LegalDoc("come to court", "Kartal");
		
		EmailDoc doc2 = new EmailDoc("altug", "hande");
		
		
		Printer printer = new Printer();
		
		printer.printDoc(doc1);
		printer.printDoc(doc2);
		
		
		
		
		
	}
	
	
}
