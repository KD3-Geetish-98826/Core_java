package com.utils;

import java.util.Comparator;

import com.student.details.Student;

public class SortByRollNo implements Comparator<Student>{
	
	@Override
	public int compare(Student x, Student y) {
		return x.getRollno() -  y.getRollno();
	}
}
