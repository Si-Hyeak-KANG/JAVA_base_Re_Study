package ch19;

public class ForTest {

	public static void main(String[] args) {

		int count = 1;
		int sum = 0;
		//for문 , 초기화식 생략 가능, 조건식생략 가능 <수행문 내부에 있을 시> ,증감식 생략 가능
		for(int i=0; i<10; i++, count++) {
			
			sum += count;
		}
		System.out.println(sum);

		//while문
		int num =1;
		int total = 0;
		
		while(num <= 10) {
			
			total += num;
			num++;
		}
		
		System.out.println(total);
	}

}
//for(;;) 무한반복 , while(true)