package ch06;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		
		Powder powder = new Powder(); //Powder material
		ThreeDPrinter3 printer = new ThreeDPrinter3(); //object ThreeDPrinter�� ����
		
		printer.setMaterial(powder); //Powder�� object���� ���ϹǷ� ��ȯ ����
		
		Powder p = (Powder)printer.getMaterial(); // printer�� ��ȯ�ϴ� ���� object�̱⿡, ���� �� ��ȯ ���������
		}
}
