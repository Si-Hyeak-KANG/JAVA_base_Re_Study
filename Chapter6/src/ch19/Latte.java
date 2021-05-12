package ch19;

public class Latte extends Decorator {

	public Latte(Coffee coffee) {
		super(coffee);
		//���� Ŭ������ default constructor�� ��� ���� Ŭ������ �ݵ�� �Ű������� �ִ� super�� ��������� ȣ��
	}

	@Override
	public void brewing() {
		super.brewing();
		System.out.println("Adding Milk");
	}
	
	

}
