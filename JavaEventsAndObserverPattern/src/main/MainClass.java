package main;

public class MainClass {

	
	public static void main(String[] args) {
		
		
		Button btn1 = new Button();
		
		
		MyButtonListener form1 = new MyButtonListener();
		btn1.addListener(form1);
		
		//Setting a listener (observer)
		btn1.addListener(new MouseClickListener() {
			
			@Override
			public void mouseClicked(MouseClickEventObj evt) {
				System.out.println("Anonym type: " +  evt.getMessageOfEvent() + " at " + evt.getTimeOfEvent());
				
			}
		});
		//Setting a listener (observer)
		btn1.addListener(evt->{
			System.out.println("Lambda type: " +  evt.getMessageOfEvent() + " at " + evt.getTimeOfEvent());
		});
		
		
		
		btn1.doClick();
		
		
		
	}
	
	
}
