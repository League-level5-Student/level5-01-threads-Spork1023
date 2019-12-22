package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ThreadPool {
	Thread[] threads;
	ConcurrentLinkedQueue<Task> tasks;
	
	public ThreadPool(int i) {
		threads = new Thread[i];
		tasks = new ConcurrentLinkedQueue<Task>();
		for (int j = 0; j < threads.length; j++) {
			threads[j] = new Thread(new Worker(tasks));
		}
	}

	public void addTask(Task task) {
		tasks.add(task);
	}
	
	void start() {
		for(Thread t : threads) {
			t.start();
			System.out.println(t.getName());
		}
		for(Thread t : threads) {
			try {
				System.out.println(t.getName());
				t.join();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
