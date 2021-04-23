package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5]; // 복사 받을 새로운 공간을 만듬
				
		library[0] = new Book("태백산맥", "탐라");
		library[1] = new Book("태백산맥1", "탐라");
		library[2] = new Book("태백산맥2", "탐라");
		library[3] = new Book("태백산맥3", "탐라");
		library[4] = new Book("태백산맥4", "탐라");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5); //library에서 0부터 있는 객체들을 copyLibrary의 0부터에 자리에 5개 카피해라
		
//		System.out.println("=== library ===");
//		
//		for(Book book : library) {
//			
//			System.out.println(book);
//			book.showInfo();
//		}
//		
//		System.out.println("=== copyLibrary ===");
//		
//		for(Book book : copyLibrary) {
//			
//			System.out.println(book);
//			book.showInfo();
//		}
		
		library[0].setAuthor("박완서"); //배열 첫번째 위치 내용 변경
		library[0].setTitle("나무"); //배열 첫번째 위치 내용 변경
	
		for(Book book : library) {
			
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("=== copyLibrary ===");
		
		for(Book book : copyLibrary) {
			
			System.out.println(book);
			book.showInfo();
		}
		// 변경된 내용까지 그대로 복사한다.
		
	}

}
