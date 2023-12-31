package exceptionhandling;

public class ExceptionExample1 {
	public static void main(String[] args) {

		int num1 = 50;
		// try-catch-finally
		try {
			num1 = num1 / 0;

		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println("(Catch) Integer cannot be divided by 0");
		}

		finally {
			num1 = num1 + 1;
			System.out.println("(Finally) block executed regardless of catching the error");
		}

	}
}
