package ch07;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {

	public static void main(String[] args) {

		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("김유신", 20, 200);
		TravelCustomer customerHong = new TravelCustomer("홍길동", 13, 50);
		
		List<TravelCustomer> customerList = new ArrayList<>();
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.print("고객 명단 :"); //이름만 출력
		customerList.stream().map(c->c.getName()).forEach(s-> System.out.print(s + " "));
		
		System.out.println();
		
		System.out.print("여행비용 : "); // 여행비용을 합친 값을 출력
		System.out.println(customerList.stream().mapToInt(c->c.getPrice()).sum() + "만원");
		
		System.out.print("20세 이상 고객 :"); //조건에 맞는 사람을 정렬해서 출력
		customerList.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s->System.out.print(s + " "));
	}

}
