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
		//CompleteCalc�� ���� ������ Ÿ���� Calc�� �߱⿡ Calc �������̽��� ����� �޼��常 ��� ����
		
		//default �޼���� ������ ������ �޼���, �������̽��� �����ϴ� Ŭ�������� �������� ����� �� �ִ� �޼���
		calc.description();
		
		//static(����) �޼���� �ν��Ͻ� ���� ���� �������̽� Ÿ�Կ� �ٷ� ��� ����
		int[] arr = { 1,2,3,4,5};
		System.out.println(Calc.total(arr));
		
		
		
	}

}
