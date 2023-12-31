package learnthreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(2);

		for (int i = 0; i < 10; i++) {
			Runnable runnable = new RunnableThread("worker thread: " + i);
			service.execute(runnable);

		}
		service.shutdown();

		while (!service.isTerminated()) {
		}
		System.out.println("All threads completed");

	}
}
