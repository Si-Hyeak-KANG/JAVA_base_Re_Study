package ch01;

class OutClass {
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	//내부 클래스
	private class InClass {
		
		int iNum = 100;
		
		// 인스턴스 inner 클래스 내부에서는 정적 변수를 사용할 수 없음
		// 정적 변수는 정적 내부 클래스에서 사용
		// static int sinNum = 500; //오류
		
		//일반 메서드
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass iNum = " + iNum + "(내부 클래스의 인트턴스 변수)");
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	//정적 내부 클래스
	static class InStaticClass {
		
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println("OutClass iNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass iNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
		}
		
		static void sTest() {
			// System.out.println("OutClass iNum = " + iNum + "(내부 클래스의 인스턴스 변수)"); ///정적 메서드에서는 내부 클래스의 인스턴스를 사용 못함 
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass iNum = " + sInNum + "(내부 클래스의 스태틱 변수)");
		}
	}
}


public class InnerTest {

	public static void main(String[] args) {

	/*	OutClass outClass = new OutClass();
		outClass.usingClass();
		
		System.out.println();
		*/
		
//		OutClass.Inclass inner = outClass.new InClass();
		//InClass가 private이 아닐 때 위처럼 외부에서 생성 가능. 문법적으로는 가능하나 잘 안함
//		inner.inTest(); 
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest(); //일반 메서드
		
		System.out.println();
		
		OutClass.InStaticClass.sTest(); // 클래스 생성과 무관하게 정적 클래스 바로 호출 가능 
	}

}
