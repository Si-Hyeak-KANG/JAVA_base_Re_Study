package ch02;

public class EqualsTest {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student std1 = new Student(2014108068, "Lee");
		Student std2 = new Student(2014108068, "Lee");
		
		System.out.println(std1 == std2); //�� ���� �ٸ� ��ü�̱� ������ false
		System.out.println(std1.equals(std2)); //false
		//������ �Ŀ����� �ּҴ� �ٸ����� �������� ���� ������ true ��ȯ
		
		System.out.println(std1.hashCode()); //hashCode ������ ������ �ʱ� �ؽð� ��ȯ
		System.out.println(std2.hashCode()); //hashCode ������ ��, �й� ��ȯ
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode()); // str1�� str2�� �ؽ��ڵ� ����
		
		Integer i = 100;
		System.out.println(i.hashCode()); // 100
		
		System.out.println(System.identityHashCode(std1)); //���� �ؽ��ڵ� �� ȣ�� static �Լ� -> ������ �Ұ�
		System.out.println(System.identityHashCode(std2));
		
		std1.setStudentName("kim");
		Student copyStudent = (Student)std1.clone();
		System.out.println(copyStudent);
	}

}
