package ch21;

public class ObjectCopyTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5]; // ���� ���� ���ο� ������ ����
				
		library[0] = new Book("�¹���", "Ž��");
		library[1] = new Book("�¹���1", "Ž��");
		library[2] = new Book("�¹���2", "Ž��");
		library[3] = new Book("�¹���3", "Ž��");
		library[4] = new Book("�¹���4", "Ž��");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5); //library���� 0���� �ִ� ��ü���� copyLibrary�� 0���Ϳ� �ڸ��� 5�� ī���ض�
		
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
		
		library[0].setAuthor("�ڿϼ�"); //�迭 ù��° ��ġ ���� ����
		library[0].setTitle("����"); //�迭 ù��° ��ġ ���� ����
	
		for(Book book : library) {
			
			System.out.println(book);
			book.showInfo();
		}
		
		System.out.println("=== copyLibrary ===");
		
		for(Book book : copyLibrary) {
			
			System.out.println(book);
			book.showInfo();
		}
		// ����� ������� �״�� �����Ѵ�.
		
	}

}
