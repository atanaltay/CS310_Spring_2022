package main;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


//Subject or Event Source
public class Button {
	
	List<MouseClickListener> listeners = new ArrayList<>();
	
	
	public void addListener(MouseClickListener listener) {
		listeners.add(listener);
	}
	
	public void doClick() {
		
		MouseClickEventObj evt 
		= new MouseClickEventObj(LocalDateTime.now(), "Mouse is clicked");
		
		listeners.forEach(lis->{
			lis.mouseClicked(evt);
		});
	}
	
	
	
	
	

}
