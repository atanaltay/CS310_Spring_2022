package main;

import java.util.function.Consumer;

import main.Book.Cover;

public class MainClass {

	public static void main(String[] args) {
		
		Cover cover = new Book(). new Cover("Blue", "Cover Page");
		
		
		// for static member classes -> Cover cov = new Book.Cover();
		
		Book book = new Book("Book 1", 2022, cover);
		
		book.addPage(new IntroPage());
		
		
		//Anonymous inner class:
		
		book.addPage(new Page() {
			//inner class
			
			@Override
			public String getContent() {
				return "Page 2";
			}
		});
		
		
		book.addPage(new Page() {
			
			
			@Override
			public String getContent() {
				return "Page 3";
			}
		});
		
		
		Page page4 = new Page() {
			
			@Override
			public String getContent() {
				return "Page 4";
			}
			
		};
		
		book.addPage(page4);
		
		book.addPage(()-> {
			return "Page 5";
		});
		
		book.addPage(()-> "Page 6");
		
		System.out.println(book);
		System.out.println("----------------");
		
		for (Page page : book.getPages()) {
			System.out.println(page.getContent());
		}
		
		
		//Lambda foreach
		//Java Streams
		
		//Anonymous way:
		/*
		book.getPages().forEach(new Consumer<Page>() {
			
			@Override
			public void accept(Page t) {
				// TODO Auto-generated method stub
				
			}
		});
		
		*/
		
		//Lambda expression way of foreach loop
		book.getPages().forEach(p-> System.out.println(p.getContent()));
		
	}
	
	
	
}
