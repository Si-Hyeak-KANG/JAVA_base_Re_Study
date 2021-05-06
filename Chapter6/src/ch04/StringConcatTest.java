package ch04;

public class StringConcatTest {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "World";
		
		//��ü �������� ���
		StringConcatImpl strImpl = new StringConcatImpl();
		strImpl.makeString(s1, s2); 
		
		//���ٽ�
		StringConcat concat = (s,v) -> System.out.println(s + "," + v);
		concat.makeString(s1, s2);
		
		
		//���ٽ��� ���ο� �͸�Ŭ������ ���δ�
		//anonymous inner class
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {

				System.out.println(s1 + "...." + s2);
			}
		};
		
		concat2.makeString(s1, s2);
	}

}
