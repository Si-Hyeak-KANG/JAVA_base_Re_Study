package school;

import java.util.ArrayList;

import utils.Define;

public class Subject {

	private String subjectName;					//���� �̸�
	private int subjectId;						//���� ������ȣ
	private int gradeType;						//���� �� ���(�⺻�� A,B ���)
	
	//���� ��û�� �л� ����Ʈ
	//register() �޼��带 ȣ���ϸ� ����Ʈ�� �߰�
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	public Subject(String subjectName, int subjectId) {
		this.subjectName = subjectName;
		this.subjectId = subjectId;
		this.gradeType = Define.AB_TYPE; //�⺻������ A,B Ÿ��
	}

	public void register(Student student) {
		studentList.add(student);
		
	}
	
	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	
	
}
