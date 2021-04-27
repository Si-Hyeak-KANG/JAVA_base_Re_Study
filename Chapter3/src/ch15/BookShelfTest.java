package ch15;

public class BookShelfTest {

	public static void main(String[] args) {

		Queue bookQueue = new Bookshelf();
		bookQueue.enQueue("토지1");
		bookQueue.enQueue("토지2");
		bookQueue.enQueue("토지3");
		bookQueue.enQueue("토지4");
		bookQueue.enQueue("토지5");
		
		System.out.println(bookQueue.getSize());
		System.out.println(bookQueue.deQueue()); //deQueue를 호출할 때마다 배열에서 한개씩 제거가 됨.
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
	}

}
