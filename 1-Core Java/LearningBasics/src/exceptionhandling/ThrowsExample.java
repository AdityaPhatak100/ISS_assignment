package exceptionhandling;

public class ThrowsExample {
	public static void hasPassed(int marks) throws ArithmeticException {
		if (marks > 100 || marks < 0) {
			throw new ArithmeticException("Marks out of bounds");
		} else if (marks < 35) {
			System.out.println("Student has failed");
		} else {
			System.out.println("Student has passed");
		}

	}

	public static void main(String[] args) throws ArithmeticException {
		hasPassed(90);
		hasPassed(110);
	}
}
