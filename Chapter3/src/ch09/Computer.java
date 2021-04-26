package ch09;

public abstract class Computer {

	//하위 클래스에게 책임 위임.
	public abstract void display();
	public abstract void typing();
	
	//하위 클래스도 공통으로 사용할 메서드
	public void turnOn() {
		
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		
		System.out.println("전원을 끕니다.");
	}
}

