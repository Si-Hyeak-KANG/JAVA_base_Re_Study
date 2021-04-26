package ch09;

public class ComputerTest {

	public static void main(String[] args) {

		//추상 클래스(abstract)는 new 할 수 없음
		Computer desktop = new DeskTop();
		desktop.display();
		
	}

}
