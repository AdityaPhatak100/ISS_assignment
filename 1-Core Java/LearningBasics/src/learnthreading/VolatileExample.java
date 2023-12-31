package learnthreading;

public class VolatileExample extends Thread {

	private static volatile int increment = 0;
	private int name;

	VolatileExample(int name) {
		this.name = name;
	}

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
			increment++;
			System.out.println(
					String.format("Thread %s: value changed from %d to %d", this.name, increment, increment + 1));

		}
	}

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			VolatileExample thread = new VolatileExample(i);
			thread.start();

		}

	}

}
