package com.studyjavac.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {

		/*
		 * ArrayList<Employee> emps=new ArrayList<>(); emps.add(new
		 * Employee(101, "vivek", 23)); emps.add(new Employee(102, "rahul",
		 * 22));
		 */

		List<Student> studs = new ArrayList<>();

		studs.add(new Student(101, "vivek", 23));
		studs.add(new Student(102, "rahul", 24));
		studs.add(new Student(102, "rahul", 22));
		studs.add(new Student(102, "rahul", 24));

		studs.add(new Student(102, "rahul", 26));

		System.out.println(studs);
		Collections.sort(studs, new StudCompare());
		System.out.println(studs);

	}

}
