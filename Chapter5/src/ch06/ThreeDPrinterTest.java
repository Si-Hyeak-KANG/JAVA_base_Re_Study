package ch06;

public class ThreeDPrinterTest {

	public static void main(String[] args) {
		
		Powder powder = new Powder(); //Powder material
		ThreeDPrinter3 printer = new ThreeDPrinter3(); //object ThreeDPrinter로 생성
		
		printer.setMaterial(powder); //Powder가 object형에 속하므로 변환 가능
		
		Powder p = (Powder)printer.getMaterial(); // printer가 반환하는 것은 object이기에, 강제 형 변환 시켜줘야함
		}
}
