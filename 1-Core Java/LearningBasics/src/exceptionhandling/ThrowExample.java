package exceptionhandling;

public class ThrowExample {

	public static void checkIfEligible(int age) {

		if (age < 18) {
			throw new ArithmeticException("Not eligible for driver's liscence.");
		} else {
			System.out.println("Eligible for driver's liscence");
		}
	}

	public static void main(String[] args) {
		checkIfEligible(17);
	}

}
