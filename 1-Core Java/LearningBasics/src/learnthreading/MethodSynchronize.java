package learnthreading;

class Increment {

	synchronized void incrementValue(int n) {
		for (int i = 0; i < 10; i++) {

			System.out.println(n + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class Thread1 extends Thread {

	Increment obj;
	int n;

	Thread1(Increment obj, int n) {
		this.obj = obj;
		this.n = n;
	}

	@Override
	public void run() {
		this.obj.incrementValue(this.n);
	}

}

public class MethodSynchronize {

	public static void main(String[] args) {

		Increment obj = new Increment();
		Thread1 t1 = new Thread1(obj, 5);
		Thread1 t2 = new Thread1(obj, 200);

		t1.start();
		t2.start();
	}

}
