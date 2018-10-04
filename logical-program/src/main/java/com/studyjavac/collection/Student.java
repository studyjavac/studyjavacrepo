package com.studyjavac.collection;

import java.util.Comparator;

public class Student implements Comparable<Student>{

	private int sId;
	private String sName;
	private int age;

	public Student(int sId, String sName, int age) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.age = age;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.age>o.age?1:this.age>o.age?0:-1;
	}

}
