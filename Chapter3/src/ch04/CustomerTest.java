package ch04;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10001, "�̼���");
		
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo() + "�׸��� 1000���� ������ ���� �� ������ ���� " 
				+ price + "���Դϴ�.");

		VIPCustomer customerKim = new VIPCustomer(10002, "������");
		customerKim.bonusPoint = 12000;
		price = customerKim.calcPrice(1000);
		System.out.println(customerKim.showCustomerInfo()+ "�׸��� 1000���� ������ ���� �� ������ ���� " 
				+ price + "���Դϴ�.");
		
		
		Customer vc = new VIPCustomer(12345, "noname");
		vc.calcPrice(1000);
		System.out.println(vc.showCustomerInfo()+ "�׸��� 1000���� ������ ���� �� ������ ���� " 
				+ price + "���Դϴ�.");
		
	}

}
