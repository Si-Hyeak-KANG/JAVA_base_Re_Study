package ch24T;

import java.util.ArrayList;

public class Student {

	private String studentName;
	private int studentId;

	ArrayList<Subject> mySubject;
	
	public Student(String studentName, int studentId) {
		
		this.studentName = studentName;
		this.studentId = studentId;
		
		mySubject = new ArrayList<>();
	}
	
	public void addSubject(String name, int score) {
		
		Subject subject = new Subject();
		
		subject.setSubjectName(name);
		subject.setScore(score);
		mySubject.add(subject);
	}
	
	public void showStudentInfo() {
		
		int total = 0;
		
		for(Subject s : mySubject) {
			
			total += s.getScore();
			System.out.println("�л� " + studentName + "�� " + s.getSubjectName() + " ���� ������ " +
					s.getScore() + "�Դϴ�.");
		}
		
		System.out.println("�л� " + studentName + " �� ������ " + total + "�Դϴ�.");
	}
	

}
