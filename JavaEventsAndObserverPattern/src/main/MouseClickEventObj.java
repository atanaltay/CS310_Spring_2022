package main;

import java.time.LocalDateTime;

//Event Object
//Returns us information about the event.
public class MouseClickEventObj {

	private LocalDateTime timeOfEvent;
	private String messageOfEvent;
	
	public MouseClickEventObj() {
		// TODO Auto-generated constructor stub
	}
	
	public MouseClickEventObj(LocalDateTime timeOfEvent, String messageOfEvent) {
		super();
		this.timeOfEvent = timeOfEvent;
		this.messageOfEvent = messageOfEvent;
	}

	public LocalDateTime getTimeOfEvent() {
		return timeOfEvent;
	}

	public void setTimeOfEvent(LocalDateTime timeOfEvent) {
		this.timeOfEvent = timeOfEvent;
	}

	public String getMessageOfEvent() {
		return messageOfEvent;
	}

	public void setMessageOfEvent(String messageOfEvent) {
		this.messageOfEvent = messageOfEvent;
	}
	
	
	
	
	
	
}
