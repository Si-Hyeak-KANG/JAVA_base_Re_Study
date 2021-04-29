package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student std1 = new Student(2014108068, "Lee");
		Student std2 = new Student(2014108068, "Lee");
		
		System.out.println(std1 == std2); //두 개는 다른 객체이기 때문에 false
		System.out.println(std1.equals(std2)); //false
		//재정의 후에서는 주소는 다르지만 논리적으로 같기 때문에 true 반환
		
		System.out.println(std1.hashCode()); //hashCode 재정의 전에는 초기 해시값 반환
		System.out.println(std2.hashCode()); //hashCode 재정의 후, 학번 반환
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode()); // str1과 str2의 해시코드 동일
		
		Integer i = 100;
		System.out.println(i.hashCode()); // 100
		
		System.out.println(System.identityHashCode(std1)); //실제 해시코드 값 호출 static 함수 -> 재정의 불가
		System.out.println(System.identityHashCode(std2));
		
		std1.setStudentName("kim");
		Student copyStudent = (Student)std1.clone();
		System.out.println(copyStudent);
	}

}
