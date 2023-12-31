package com.advanced;

/* 
 * Concepts covered:	7.1 List with custom objects, Comparable vs Comparator
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StudentMarks implements Comparable<StudentMarks> {

	private String name;
	private int math;
	private int physics;
	private int total;

	StudentMarks(String name, int math, int physics) {
		this.name = name;
		this.math = math;
		this.physics = physics;
		this.total = math + physics;
	}

	@Override
	public int compareTo(StudentMarks s) {

		return s.total - this.total;
	}

	public String getName() {
		return this.name;
	}

	public int getMath() {
		return this.math;
	}

	public int getPhysics() {
		return this.physics;
	}

	public int getTotal() {
		return this.total;
	}

}

class MathCompare implements Comparator<StudentMarks> {
	public int compare(StudentMarks s1, StudentMarks s2) {
		if (s1.getMath() < s2.getMath())
			return -1;
		if (s1.getMath() > s2.getMath())
			return 1;
		else
			return 0;
	}
}

public class StudentData {
	public static void main(String[] args) {
		StudentMarks student1 = new StudentMarks("Aditya", 98, 99);
		StudentMarks student2 = new StudentMarks("Ajay", 97, 91);
		StudentMarks student3 = new StudentMarks("Amod", 81, 86);
		StudentMarks student4 = new StudentMarks("Abhinav", 93, 84);
		StudentMarks student5 = new StudentMarks("Anurag", 76, 92);

		ArrayList<StudentMarks> studentList = new ArrayList<StudentMarks>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);

		Collections.sort(studentList);

		for (StudentMarks s : studentList) {
			System.out.println(String.format("%s - Math:%d Physics:%d Total:%d", s.getName(), s.getMath(),
					s.getPhysics(), s.getTotal()));
		}

		MathCompare mathCompare = new MathCompare();
		Collections.sort(studentList, mathCompare);

		for (StudentMarks s : studentList) {
			System.out.println(String.format("%s - Math:%d Physics:%d Total:%d", s.getName(), s.getMath(),
					s.getPhysics(), s.getTotal()));
		}

	}
}
