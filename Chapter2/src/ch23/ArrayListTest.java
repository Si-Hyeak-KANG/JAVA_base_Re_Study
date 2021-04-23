package ch23;

import java.util.ArrayList;

import ch21.Book;

public class ArrayListTest {

	public static void main(String[] args) {

		//generic<> 어떤 객체를 넣을거냐 지정
		ArrayList<Book> library = new ArrayList<>();
		
		library.add(new Book("태백산맥1","조정래"));
		library.add(new Book("태백산맥2","조정래"));
		library.add(new Book("태백산맥3","조정래"));
		library.add(new Book("태백산맥4","조정래"));
		library.add(new Book("태백산맥5","조정래"));
		
		for(int i = 0; i<library.size(); i++) {
			library.get(i).showInfo(); // library의 i번째 값을 꺼내와라
		}
	}


}
