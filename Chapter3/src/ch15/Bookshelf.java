package ch15;

public class Bookshelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {

		shelf.add(title);
	}

	@Override
	public String deQueue() {

		return shelf.remove(0); // arrayList의 0번째 위치한 것 호출
	}

	@Override
	public int getSize() {
		return getCount();
	}

}
