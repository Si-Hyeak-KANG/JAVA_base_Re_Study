package ch02;

public class AddTest {

	public static void main(String[] args) {

		Add addL = (x,y)-> { return x+y;}; //functional interface�� ���� Add�� add �Լ��� ����
		System.out.println(addL.add(2, 3));
		
		
	}

}

