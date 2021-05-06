package ch02;

public class AddTest {

	public static void main(String[] args) {

		Add addL = (x,y)-> { return x+y;}; //functional interface로 만든 Add의 add 함수를 구현
		System.out.println(addL.add(2, 3));
		
		
	}

}

