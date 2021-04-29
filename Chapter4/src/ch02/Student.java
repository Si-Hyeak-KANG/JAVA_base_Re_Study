package ch02;

public class Student implements Cloneable{

	private int studentNum;
	private String studentName;
	
	public Student(int studentNum, String studentName) {
		
		this.studentNum = studentNum;
		this.studentName = studentName;
		
	}
	
	public void setStudentName(String name) {
		this.studentName = name; 
	}

	public String toString() {
		return studentNum + ", " + studentName;
	}

	//Object의 equals 재정의
	@Override
	public boolean equals(Object obj) {

		if(obj instanceof Student) {
			Student std = (Student)obj;//다운캐스팅
			if (this.studentNum == std.studentNum)
				return true;
		}
		
		return false;
	}

	@Override
	public int hashCode() {
		
		return studentNum;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	
	
}
