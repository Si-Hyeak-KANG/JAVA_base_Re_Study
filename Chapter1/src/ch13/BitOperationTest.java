package ch13;

public class BitOperationTest {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 10;
		
		System.out.println( num1 | num2); // 00000101 , 00001010 �� ������ 00001111 = 15
		System.out.println( num1 & num2); // 00000101, 00001010 ��Ʈ�� ������ �����Ƿ� = 0 
		System.out.println( num1 ^ num2); // �ΰ��� ��Ʈ�� �ٸ��� 1 = 00001111 = 15
		System.out.println( ~num1); //11111010 -> ���� =-6
		
		System.out.println(num1 << 2); //00000101 -> 00010100(20) 5x2^2
		System.out.println(num1 <<= 2); //���� �ٲٴ� ��� (���Կ�����)
		System.out.println(num1);
		System.out.println(num1 >> 1);
	}

}
