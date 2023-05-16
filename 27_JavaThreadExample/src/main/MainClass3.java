package main;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass3 {

	
	public static void main(String[] args) {
		
		//Executors.newCachedThreadPool()
		//Executors.newFixedThreadPool(5);
		
	 ExecutorService srv =	Executors.newCachedThreadPool();
		
		srv.submit(new CountThread("Thread-1"));
		
		srv.submit(()->{
			for (int i = 0; i < 100; i++) {
				
				
				System.out.println("Thread-2 : count" + i);
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		
		srv.shutdown();
		
		
		
	}
	
	
	static class CountThread implements Runnable{
		
		String name;
		
		public CountThread(String name) {
			this.name = name;
		}
		
		
		public String getName() {
			return name;
		}
		
		@Override
		public void run() {

			for (int i = 0; i < 100; i++) {
				
				
				System.out.println(getName() +  ": count" + i);
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			
			
			
		}
	}
}




