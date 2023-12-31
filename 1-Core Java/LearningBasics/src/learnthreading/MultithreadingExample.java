package learnthreading;

// Runnable interface can also be used

public class MultithreadingExample extends Thread {

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) throws InterruptedException {

		for (int i = 1; i < 5; i++) {
			MultithreadingExample t1 = new MultithreadingExample();
			t1.start();

		}
	}
}
