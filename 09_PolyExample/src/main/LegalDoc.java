package main;

public class LegalDoc implements Printable{

	private String title;
	private String court;
	public LegalDoc(String title, String court) {
		super();
		this.title = title;
		this.court = court;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCourt() {
		return court;
	}
	public void setCourt(String court) {
		this.court = court;
	
	}
	@Override
	public void print() {
		System.out.println("Legal doc:");
		System.out.println("Title:" + title);
		System.out.println("Court:" + court);
		
	}
	
	
	

	
	
}
