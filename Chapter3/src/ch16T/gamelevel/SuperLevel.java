package ch16T.gamelevel;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {

		System.out.println("�ʹ� ���� �������� �ʽ��ϴ�.");
	}

	@Override
	public void jump() {
		
		System.out.println("���� ���� jump �մϴ�.");
	}

	@Override
	public void turn() {
		
		System.out.println("turn�� �մϴ�");
	}

	@Override
	public void showLevelMessage() {
		
		System.out.println("****** ����� �����Դϴ�.******");
	}
}
