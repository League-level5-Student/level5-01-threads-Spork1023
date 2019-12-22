package _04_Thread_Pool;

import java.util.concurrent.ConcurrentLinkedQueue;

public class Worker implements Runnable {
	ConcurrentLinkedQueue<Task> tasks;
	
	public Worker(ConcurrentLinkedQueue<Task> tasks) {
		this.tasks = tasks;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(tasks.size());
		while(!tasks.isEmpty()) {
			tasks.remove().perform();
		}
	}


}
