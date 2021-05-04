package ch01;


class Outer2 {
	
	int outNum = 100;
	static int sNum = 200;
	
	//Runnalbe 인터페이스 : 클래스를 스레드화할 때 run() 메서드를 구현할 때 사용 
	Runnable getRunnable(int i) {

		int num = 10;
		
		return new Runnable() {

			int localNum = 1000;
			@Override
			public void run() {

				/* final(상수화)이 이미 되어있기 때문에 값을 변경하려고 하면 오류걸림.
				i = 50;
				num = 20; 
				*/
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outter.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");
			}
			
		}; //anonymous inner class	
	}
	
	Runnable runnable = new Runnable() {
		
		@Override
		public void run() {

			System.out.println("Runnable class");
		}
	};
}



public class AnonymousInnerTest {

	public static void main(String[] args) {

		Outer2 out = new Outer2();
		Runnable runner = out.getRunnable(100);
		
		runner.run();
		
		out.runnable.run();
	}

}
