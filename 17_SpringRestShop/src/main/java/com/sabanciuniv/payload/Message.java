package com.sabanciuniv.payload;

import java.time.LocalDateTime;

public class Message {
	
	private String text;
	private LocalDateTime responseDate;
	
	public Message() {
		// TODO Auto-generated constructor stub
	}

	public Message(String text, LocalDateTime responseDate) {
		super();
		this.text = text;
		this.responseDate = responseDate;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public LocalDateTime getResponseDate() {
		return responseDate;
	}

	public void setResponseDate(LocalDateTime responseDate) {
		this.responseDate = responseDate;
	}
	
	

}
