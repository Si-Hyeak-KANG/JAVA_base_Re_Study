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
		buyer.order();//재정의 된 order 메서드 호출
		
		Sell seller = customer;
		seller.sell();
		seller.order(); // 재정의 된 order 메서드 호출
		
		//client에게 어떤 인터페이스를 열어주냐에 따라 사용할 수 있는 기능이 다르다.
	}

}
