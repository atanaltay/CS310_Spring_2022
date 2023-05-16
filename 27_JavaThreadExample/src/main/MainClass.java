package main;

public class MainClass {

	//Main is the main thread of your application
	// main controls all other threads and waits for them to
	//finish.
	public static void main(String[] args) {
		
		System.out.println("Main thread has started");

		
		CountThread thread1 = new CountThread("Thread-1");
		thread1.start();
		
		CountThread thread2 = new CountThread("Thread-2");
		thread2.start();
		
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
	
	static class CountThread extends Thread{
		
		
		public CountThread(String name) {
			this.setName(name);
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
