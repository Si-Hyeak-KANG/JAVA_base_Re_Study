package ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerT = new Customer(10010, "Tomas");
		Customer customerO = new Customer(10010, "Orie");
		Customer customerM = new GoldCustomer(10010, "Mars");
		Customer customerA = new GoldCustomer(10010, "Antoney");
		Customer customerS = new VIPCustomer(10010, "Sterling");
		
		customerList.add(customerT);
		customerList.add(customerO);
		customerList.add(customerM);
		customerList.add(customerA);
		customerList.add(customerS);
		
		for( Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		int price = 10000;
		for (Customer customer : customerList) {
			
			int cost = customer.calcPrice(price);
			
			System.out.println(customer.getCustomerName() + "����" + cost + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getCustomerName() + "���� ���� ���ʽ� ����Ʈ�� " + customer.bonusPoint + "�Դϴ�.");
		}
		
		
	}

}
