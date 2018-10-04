package com.studyjavac.collection;

public class Employee implements Comparable<Employee> {

	private int eId;
	private String eName;
	private int age;

	public Employee(int eId, String eName, int age) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.age = age;
	}

	@Override
	public int compareTo(Employee e) {
		int age = e.age;
		return new Integer(this.age).compareTo(new Integer(age));
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", age=" + age + "]";
	}

}
