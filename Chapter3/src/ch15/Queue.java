package ch15;

public interface Queue {

	void enQueue(String title); //책을 넣어라
	String deQueue(); //책을 꺼내라 - 책의 이름 반환 예정
	
	int getSize(); //책이 몇 개가 있나
}
