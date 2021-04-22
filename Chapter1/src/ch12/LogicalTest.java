package ch12;

public class LogicalTest {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i =2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i+2) < 10);
		
		System.out.println(value);
		System.out.println(num1);
		System.out.println(i);//앞이 항이 이미 false이기때문에 뒤에 항 계산 안함
		//short circuit evaluation 단락 회로 평가
	}

}
 