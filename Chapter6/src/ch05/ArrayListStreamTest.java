package ch05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;



public class ArrayListStreamTest {

	public static void main(String[] args) {

		List<String> sList = new ArrayList<String>();
		sList.add("Tomas"); //5
		sList.add("Edward"); //6
		sList.add("Jack"); //4
		
		//컬렉션에 대한 Stream을 사용할 때는 제너릭 타입으로 가지고 있는 것을 명시
		Stream<String> stream = sList.stream();
		stream.forEach(s->System.out.println(s));
		
		sList.stream().sorted().forEach(s->System.out.print(s + "\t"));
		System.out.println();
		sList.stream().map(s->s.length()).forEach(n->System.out.print(n + "\t"));
		System.out.println();
		sList.stream().filter(s->s.length() >= 5).forEach(s->System.out.print(s + "\t"));
	}

}
