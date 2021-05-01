package ch06;

public class GenericPrinterTest {

	public static void main(String[] args) {

		Powder powder = new Powder();
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>(); // 다이아몬드 연산자
		
		powderPrinter.setMaterial(powder);
		
		Powder p = powderPrinter.getMaterial(); // 형변환을 하지않아도 됨.
		System.out.println(p.toString());
		}

}
