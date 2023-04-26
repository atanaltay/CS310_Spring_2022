package main;

//Observer or Listener implementation
public class MyButtonListener implements MouseClickListener{

	@Override
	public void mouseClicked(MouseClickEventObj evt) {
		System.out.println(evt.getMessageOfEvent() + " at " + evt.getTimeOfEvent());
		
	}

}
