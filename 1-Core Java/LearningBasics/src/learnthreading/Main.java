package learnthreading;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		for (int i = 1; i < 5; i++) {
			MultithreadingExample t1 = new MultithreadingExample();
			t1.start();

		}

	}
}
