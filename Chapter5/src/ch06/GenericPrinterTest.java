package ch06;

public class GenericPrinterTest {

	public static void main(String[] args) {

		Powder powder = new Powder();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>(); // ���̾Ƹ�� ������
		
		powderPrinter.setMaterial(powder);
		
		Powder p = powderPrinter.getMaterial(); // ����ȯ�� �����ʾƵ� ��.
		System.out.println(p.toString());
		}

}
