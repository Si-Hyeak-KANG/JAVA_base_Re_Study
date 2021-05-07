package ch05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		for(int num : arr) {
			System.out.println(num);
		}
		
		System.out.println();
		
		IntStream is = Arrays.stream(arr); //얘가 반환해주는 애가 IntStream
		//모든 array들은 arrays 클래스를 활용 가능
		//forEach는 element를 하나씩 꺼내라
		is.forEach(n->System.out.println(n)); //위와 동일
		//한번 연산이 시행이되고나면 소멸함.
		//stream 메서드는 매번 재생성 후 호출해야 한다.
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
	}

} 
  