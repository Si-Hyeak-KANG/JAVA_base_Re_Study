package ch14;

public class CalcTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		
		CompleteCalc ccc = new CompleteCalc();
		//CompleteCalc로 생성 했지만 타입을 Calc로 했기에 Calc 인터페이스에 선언된 메서드만 사용 가능
		
		//default 메서드는 구현을 가지는 메서드, 인터페이스를 구현하는 클래스들이 공통으로 사용할 수 있는 메서드
		calc.description();
		
		//static(정적) 메서드는 인스턴스 생성 없이 인터페이스 타입에 바로 사용 가능
		int[] arr = { 1,2,3,4,5};
		System.out.println(Calc.total(arr));
		
		
		
	}

}
