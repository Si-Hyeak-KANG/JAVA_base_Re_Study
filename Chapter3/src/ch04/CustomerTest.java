package ch04;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10001, "이순신");
		
		customerLee.bonusPoint = 1000;
		int price = customerLee.calcPrice(1000);
		System.out.println(customerLee.showCustomerInfo() + "그리고 1000원인 물건을 샀을 때 지불할 값은 " 
				+ price + "원입니다.");

		VIPCustomer customerKim = new VIPCustomer(10002, "김유신");
		customerKim.bonusPoint = 12000;
		price = customerKim.calcPrice(1000);
		System.out.println(customerKim.showCustomerInfo()+ "그리고 1000원인 물건을 샀을 때 지불할 값은 " 
				+ price + "원입니다.");
		
		
		Customer vc = new VIPCustomer(12345, "noname");
		vc.calcPrice(1000);
		System.out.println(vc.showCustomerInfo()+ "그리고 1000원인 물건을 샀을 때 지불할 값은 " 
				+ price + "원입니다.");
		
	}

}
