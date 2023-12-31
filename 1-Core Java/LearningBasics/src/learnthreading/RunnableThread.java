package learnthreading;

// reference video: https://www.youtube.com/watch?v=qS8lQGdV6_M

public class RunnableThread implements Runnable {

	private String name;

	RunnableThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {

		System.out.println(String.format("Started Thread: %s", name));

		try {
			Thread.sleep(1000);

		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(String.format("Ended Thread: %s", name));
	}

}
