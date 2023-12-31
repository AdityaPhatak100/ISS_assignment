package com.basics;

/* 
 * Concepts covered:	2. basic data types, variable types
 * 						3. loop control and decision making
 * 						4. strings, arrays
 */

// Class 
public class Main {

	public String instanceVar1 = "Can be accessed by child class";
	private String instanceVar2 = "Scope restricted to Main class";
	public static String staticVar1 = "Shared among all instances of the class";

	public void doGreeting() {
		System.out.println("Hello there!");
	}

	public void doGreetingWithName(String name) {
		System.out.println("Hello " + name + "!");
	}

	public void showLocalVariable() {
		String name = "This data string cannot be printed from outside this method.";
		System.out.println(name);
	}

	public static void main(String[] args) {
		// Object instantiation
		Main object = new Main();

		// Calling methods of the Main class
		object.doGreeting();
		object.doGreetingWithName("Aditya");

		// Variable Types
		// Local Variable
		object.showLocalVariable();

		// Instance Variables
		System.out.println("Public instance variable: " + object.instanceVar1);
		System.out.println("Private instance variable: " + object.instanceVar2);

		// Static Variable - accessed directly through the class
		System.out.println(Main.staticVar1);

		// Primitive Data types
		byte b = 100;
		short s = 10000;
		int i = 100000;
		long l = 1000000000000L;
		float f = 45.45f;
		double d = 342.3253634;
		boolean bool = true;
		char c = 'A';

		// Type Casting
		int answer = (int) (b + s);

		// Other number systems
		int decimal = 100;
		int octal = 0123;
		int hexa = 0x13;

		// Unicode Chraracters
		char unicodeChar = '\u0001';
		String unicodeString = "\u0002";

		// Loop control and Decision Making

		// for
		for (int itr = 0; itr <= 10; itr++) {
			System.out.println(itr);
		}

		int itr2 = 5;
		while (itr2 > 0) {
			System.out.println(itr2--);
		}

		// if then else

		int num1 = 5;
		int num2 = 6;
		int num3 = 7;
		int largest;

		if (num1 < num2 && num3 < num2) {
			largest = num2;
		} else if (num1 < num3 && num2 < num3) {
			largest = num3;
		} else {
			largest = num1;
		}

		System.out.println(largest + " is the largest.");

		// Strings and Arrays
		// String is an array of characters

		int[] numbers = { 101, 102, 103, 104 };

		for (int j : numbers) {
			System.out.println(j);
		}

	}

}
