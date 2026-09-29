package com.utils;

import java.util.Comparator;

import com.student.details.Student;

public class SortByMarks implements Comparator<Student>{

	@Override
	public int compare(Student x, Student y) {
		return Double.compare(y.getMarks(), x.getMarks());
	}
	
}
