package ch24T;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student("LEE", 1001);
		Student studentKim = new Student("KIM", 1002);
		
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 85);
		
		studentKim.addSubject("����", 70);
		studentKim.addSubject("����", 100);
		studentKim.addSubject("����", 85);
		
		studentLee.showStudentInfo();
		System.out.println("===========================================");
		studentKim.showStudentInfo();
		
	}

}
