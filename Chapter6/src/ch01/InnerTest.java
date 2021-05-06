package ch01;

class OutClass {
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	//���� Ŭ����
	private class InClass {
		
		int iNum = 100;
		
		// �ν��Ͻ� inner Ŭ���� ���ο����� ���� ������ ����� �� ����
		// ���� ������ ���� ���� Ŭ�������� ���
		// static int sinNum = 500; //����
		
		//�Ϲ� �޼���
		void inTest() {
			System.out.println("OutClass num = " + num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass iNum = " + iNum + "(���� Ŭ������ ��Ʈ�Ͻ� ����)");
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
	
	//���� ���� Ŭ����
	static class InStaticClass {
		
		int iNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println("OutClass iNum = " + iNum + "(���� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass iNum = " + sInNum + "(���� Ŭ������ ����ƽ ����)");
		}
		
		static void sTest() {
			// System.out.println("OutClass iNum = " + iNum + "(���� Ŭ������ �ν��Ͻ� ����)"); ///���� �޼��忡���� ���� Ŭ������ �ν��Ͻ��� ��� ���� 
			System.out.println("OutClass sNum = " + sNum + "(�ܺ� Ŭ������ ����ƽ ����)");
			System.out.println("InClass iNum = " + sInNum + "(���� Ŭ������ ����ƽ ����)");
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
		//InClass�� private�� �ƴ� �� ��ó�� �ܺο��� ���� ����. ���������δ� �����ϳ� �� ����
//		inner.inTest(); 
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest(); //�Ϲ� �޼���
		
		System.out.println();
		
		OutClass.InStaticClass.sTest(); // Ŭ���� ������ �����ϰ� ���� Ŭ���� �ٷ� ȣ�� ���� 
	}

}
