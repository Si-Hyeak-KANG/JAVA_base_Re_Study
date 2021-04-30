package ch04;

public class MyArrayStackTest {

	public static void main(String[] args) {

		MyArrayStack stack = new MyArrayStack(3);
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40); // stack is full
		
		stack.printAll();
		
		System.out.println(stack.pop()); //30
		System.out.println(stack.pop()); //20
		System.out.println(stack.peek()); //남는거 체크 10
		
	}

}
