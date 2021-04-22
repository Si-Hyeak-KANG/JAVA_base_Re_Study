package ch13;

public class BitOperationTest {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 10;
		
		System.out.println( num1 | num2); // 00000101 , 00001010 의 합집합 00001111 = 15
		System.out.println( num1 & num2); // 00000101, 00001010 비트가 같은게 없으므로 = 0 
		System.out.println( num1 ^ num2); // 두개의 비트가 다르면 1 = 00001111 = 15
		System.out.println( ~num1); //11111010 -> 음수 =-6
		
		System.out.println(num1 << 2); //00000101 -> 00010100(20) 5x2^2
		System.out.println(num1 <<= 2); //값을 바꾸는 방법 (대입연산자)
		System.out.println(num1);
		System.out.println(num1 >> 1);
	}

}
