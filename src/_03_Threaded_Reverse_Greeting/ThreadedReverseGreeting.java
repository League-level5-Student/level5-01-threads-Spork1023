package _03_Threaded_Reverse_Greeting;

public class ThreadedReverseGreeting {
  //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.
static int x = 0;
	/* HINT: You will most likely need to do this with recursion */
	public static void main(String[] args) {
		rec();
	}
	
	static void rec() {
		if(x<=50) {
			int d = x;
			Thread t = new Thread(()->System.out.println("Hello from thread " + d));
			x++;
			rec();
			t.start();
		}
	}
}
