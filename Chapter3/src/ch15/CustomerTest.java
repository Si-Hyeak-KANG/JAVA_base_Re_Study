package ch15;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		Buy buyer = customer;
		buyer.buy();
		buyer.order();//������ �� order �޼��� ȣ��
		
		Sell seller = customer;
		seller.sell();
		seller.order(); // ������ �� order �޼��� ȣ��
		
		//client���� � �������̽��� �����ֳĿ� ���� ����� �� �ִ� ����� �ٸ���.
	}

}
