package ch03;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10001, "�̼���");
		
		customerLee.bonusPoint = 1000;
		
		System.out.println(customerLee.showCustomerInfo());

		VIPCustomer customerKim = new VIPCustomer(10002, "������");
		
		customerKim.bonusPoint = 12000;
		
		System.out.println(customerKim.showCustomerInfo());
		
		Customer vc = new VIPCustomer(12345, "noname");
		
		System.out.println(vc.showCustomerInfo());
	}

}
