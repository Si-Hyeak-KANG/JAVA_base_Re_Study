package ch11;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {

		//분모가 0이면 안되기 때문에 만약 0이면 오류
		if ( num2 == 0) {
			return ERROR;
		}
		return num1/ num2;
	}
	
	public void showInfo() {
		
		System.out.println("모두 구현했습니다.");
	}
	
}
