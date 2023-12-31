package com.advanced;

/* 
 * Concepts covered:	7. ArrayList, Set, HashSet, HashMap, List with custom objects
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Student {

	private int id;
	private String name;

	Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public void getName() {
		System.out.println(this.name);
	}

	public void getID() {
		System.out.println(this.id);
	}

}

public class Main {
	public static void main(String[] args) {
		// List - duplicates allowed + ordered
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("Aditya");
		list1.add("Atul");
		list1.add("Ajay");

		for (String person : list1) {
			System.out.println(person);
		}

		// Set - no duplicates allowed + unordered
		Set<String> set1 = new HashSet<String>();
		set1.add("Dollar");
		set1.add("Euro");
		set1.add("Dirham");
		set1.add("Rupee");
		set1.add("Dollar");

		for (String currency : set1) {
			System.out.println(currency);

		}

		// Map - key:value pairs + duplicate keys not allowed (leads to value updation)
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Aditya");
		map.put(2, "Ajay");
		map.put(3, "Atul");
		map.put(1, "Abhinav");

		for (HashMap.Entry<Integer, String> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// List with custom objects
		ArrayList<Student> list2 = new ArrayList<Student>();

		Student student1 = new Student(1, "Aditya");
		Student student2 = new Student(2, "Ajay");
		Student student3 = new Student(3, "Atul");
		Student student4 = new Student(4, "Abhinav");

		list2.add(student1);
		list2.add(student2);
		list2.add(student3);
		list2.add(student4);

		for (Student student : list2) {
			student.getID();
			student.getName();
		}

		//
	}
}
