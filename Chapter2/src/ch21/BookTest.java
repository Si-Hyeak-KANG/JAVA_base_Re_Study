package ch21;

public class BookTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
		/* 
		for(int i=0; i< library.length; i++) {
			System.out.println(library[i]);
		}*/
		
		//���� �ٸ� �������� ���� �濡 ��ü�� ���� ����
		library[0] = new Book("�¹���", "Ž��");
		library[1] = new Book("�¹���1", "Ž��");
		library[2] = new Book("�¹���2", "Ž��");
		library[3] = new Book("�¹���3", "Ž��");
		library[4] = new Book("�¹���4", "Ž��");
		
		for(Book book : library) {
			
			System.out.println(book);
			book.showInfo();
		}
	}

}
