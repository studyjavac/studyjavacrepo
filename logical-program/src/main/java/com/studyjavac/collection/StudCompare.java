package com.studyjavac.collection;

import java.util.Comparator;

public class StudCompare implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return Integer.valueOf(o1.getAge()).compareTo(o2.getAge());
	}

}
