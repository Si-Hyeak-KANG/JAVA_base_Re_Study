package ch07;

public class Powder extends Material{

	public String toStirng() {
		return "���� Powder �Դϴ�.";
	}

	@Override
	public void doPrinting() {
		System.out.println("powder�� ���� ����Ʈ�� �����մϴ�.");
	}
}
