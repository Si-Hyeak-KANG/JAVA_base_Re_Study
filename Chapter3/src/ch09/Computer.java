package ch09;

public abstract class Computer {

	//���� Ŭ�������� å�� ����.
	public abstract void display();
	public abstract void typing();
	
	//���� Ŭ������ �������� ����� �޼���
	public void turnOn() {
		
		System.out.println("������ �մϴ�.");
	}
	
	public void turnOff() {
		
		System.out.println("������ ���ϴ�.");
	}
}

