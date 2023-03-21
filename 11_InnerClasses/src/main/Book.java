package main;

import java.util.ArrayList;
import java.util.List;

public class Book {

	private String title;
	private int year;
	private Cover cover;
	private List<Page> pages;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title, int year, Cover cover) {
		super();
		this.title = title;
		this.year = year;
		this.cover = cover;
	}
	
	public void addPage(Page page) {
		
		if(pages == null) pages = new ArrayList<Page>();
		
		this.pages.add(page);
		
	}
	
	public List<Page> getPages() {
		return pages;
	}
	
	@Override
	public String toString() {
		String retVal =  "Book [title=" + title + ", year=" + year + ", cover=" + cover + "]";
	
		for (Page page : pages) {
			
			retVal += "\n" + page.getContent();
			
		}
		
		return retVal;
	
	}




	 class Cover{
		private String color;
		private String text;
		
		
		public Cover() {
			
		}


		public Cover(String color, String text) {
			super();
			this.color = color;
			this.text = text;
		}


		public String getColor() {
			return color;
		}


		public void setColor(String color) {
			this.color = color;
		}


		public String getText() {
			return text;
		}


		public void setText(String text) {
			this.text = text;
		}


		@Override
		public String toString() {
			return "Cover [color=" + color + ", text=" + text + "]";
		}
		
		
		
		
		
	}
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
}
