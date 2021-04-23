package ch21;

public class BookTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
		/* 
		for(int i=0; i< library.length; i++) {
			System.out.println(library[i]);
		}*/
		
		//°¢°¢ ´Ù¸¥ ÂüÁ¶°ªÀ» °¡Áø ¹æ¿¡ °´Ã¼¸¦ Á÷Á¢ »ý¼º
		library[0] = new Book("ÅÂ¹é»ê¸Æ", "Å½¶ó");
		library[1] = new Book("ÅÂ¹é»ê¸Æ1", "Å½¶ó");
		library[2] = new Book("ÅÂ¹é»ê¸Æ2", "Å½¶ó");
		library[3] = new Book("ÅÂ¹é»ê¸Æ3", "Å½¶ó");
		library[4] = new Book("ÅÂ¹é»ê¸Æ4", "Å½¶ó");
		
		for(Book book : library) {
			
			System.out.println(book);
			book.showInfo();
		}
	}

}
