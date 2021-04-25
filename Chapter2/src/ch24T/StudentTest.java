package ch24T;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student("LEE", 1001);
		Student studentKim = new Student("KIM", 1002);
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 85);
		
		studentKim.addSubject("국어", 70);
		studentKim.addSubject("수학", 100);
		studentKim.addSubject("영어", 85);
		
		studentLee.showStudentInfo();
		System.out.println("===========================================");
		studentKim.showStudentInfo();
		
	}

}
