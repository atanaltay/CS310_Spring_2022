package main;

public class EmailDoc implements Printable{

	private String to;
	private String from;
	public EmailDoc(String to, String from) {
		super();
		this.to = to;
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	@Override
	public void print() {
		System.out.println("Email message:");
		System.out.println("From:" + from);
		System.out.println("To:" + to);
		
	}
	
	
	
	
}
