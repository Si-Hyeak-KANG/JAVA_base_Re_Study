package ch08T;

public class Order {

	public String orderNumber;
	public String customerPhone;
	public String customerAddress;
	public String orderDate;
	public String orderTime;
	public int price;
	public String menuId;
	
	public void showOrderDetail() {
		
		System.out.println("�ֹ� ���� ��ȣ: " + orderNumber);
		System.out.println("�ֹ� �ڵ��� ��ȣ " + customerPhone);
		System.out.println("�ֹ� �� �ּ�: " + customerAddress);
		System.out.println("�ֹ� ��¥: " + orderDate);
		System.out.println("�ֹ� �ð�: " + orderTime);
		System.out.println("�ֹ� ����: " + price);
		System.out.println("�޴� ��ȣ: " + menuId);
	}
}
