package main;

public class MainClass2 {

	//Main is the main thread of your application
	// main controls all other threads and waits for them to
	//finish.
	public static void main(String[] args) {
		
		System.out.println("Main thread has started");

		
		Thread thread1 = new Thread(new CountThread("Thread-1"));
		
		Thread thread2 = new Thread(new CountThread("Thread-2"));
		
		
		thread1.start();
		
		thread2.start();
		
		Thread thread3 = new Thread(()->{
			
			for (int i = 0; i < 100; i++) {
				
				
				System.out.println("Lambda thread : count" + i);
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
			
		});
		
		thread3.start();
		
		for (int i = 0; i < 100; i++) {
			
			
			System.out.println("Main thread: count" + i);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
		
	}

	// 2 ways to create a thread:
		//1) Extending from Thread type
		//2) implementing the Runnable interface
	//Runnable is a functional interface
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
