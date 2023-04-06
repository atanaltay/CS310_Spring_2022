package com.sabanciuniv.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("friends")
public class Friend {
	
	@Id
	private String id;
	
	private String name;
	private int birthYear;
	private String category;

	public Friend() {
		// TODO Auto-generated constructor stub
	}

	public Friend(String name, int birthYear, String category) {
		super();
		this.name = name;
		this.birthYear = birthYear;
		this.category = category;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Friend [name=" + name + ", birthYear=" + birthYear + ", category=" + category + "]";
	}
	
	
	


}

