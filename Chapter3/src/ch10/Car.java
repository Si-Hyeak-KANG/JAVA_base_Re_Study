package ch10;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {} // 구현된 메서드(훅 메서드) : 추상메서드가 아님. 필요한 경우 하위클래스에서 재정의
	
	//시나리오를 가진 클래스 : 하위 클래스에서 재정의를 못하게 final 선언
	final public void run() {
		
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
