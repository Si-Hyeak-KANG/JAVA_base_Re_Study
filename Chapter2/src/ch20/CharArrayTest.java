package ch20;

public class CharArrayTest {

	public static void main(String[] args) {

		char[] alphabets = new char[26];
		char ch = 'A';
		
		for(int i = 0; i<alphabets.length; i++) {
			
			alphabets[i] = ch++; //문자도 결국 정수 64, 65, 66 ...
		}
		
		for(char alpha : alphabets) {
			System.out.println( alpha + "," + (int)alpha);
		}
	}

}
