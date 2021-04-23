package ch24T;

import java.util.ArrayList;

public class Student {

	private String studentName;
	private int studentNum;

	ArrayList<Subject> mysubject;
	
	public Student(String studentName, int studentNum) {
		
		this.studentName = studentName;
		this.studentNum = studentNum;
		
		mysubject = new ArrayList<>();
	}
}
