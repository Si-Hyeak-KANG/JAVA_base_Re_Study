package ch01;


class Outer2 {
	
	int outNum = 100;
	static int sNum = 200;
	
	//Runnalbe �������̽� : Ŭ������ ������ȭ�� �� run() �޼��带 ������ �� ��� 
	Runnable getRunnable(int i) {

		int num = 10;
		
		return new Runnable() {

			int localNum = 1000;
			@Override
			public void run() {

				/* final(���ȭ)�� �̹� �Ǿ��ֱ� ������ ���� �����Ϸ��� �ϸ� �����ɸ�.
				i = 50;
				num = 20; 
				*/
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				
				System.out.println("outNum = " + outNum + "(�ܺ� Ŭ���� �ν��Ͻ� ����)");
				System.out.println("Outter.sNum = " + Outer2.sNum + "(�ܺ� Ŭ���� ���� ����)");
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
