package ch03;

public class StringTest {

	public static void main(String[] args) {

		String java = new String("Java");
		String android = new String("Android");
		
		System.out.println(System.identityHashCode(java));//123961122
		
		java = java.concat(android);//java + android 
		System.out.println(System.identityHashCode(java)); //1227229563 �ٸ� �޸� ����, ���ο� �޸� ����
	}

}
