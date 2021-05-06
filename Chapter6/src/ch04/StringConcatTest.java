package ch04;

public class StringConcatTest {

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "World";
		
		//객체 지향적인 방법
		StringConcatImpl strImpl = new StringConcatImpl();
		strImpl.makeString(s1, s2); 
		
		//람다식
		StringConcat concat = (s,v) -> System.out.println(s + "," + v);
		concat.makeString(s1, s2);
		
		
		//람다식은 내부에 익명클래스가 쓰인다
		//anonymous inner class
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {

				System.out.println(s1 + "...." + s2);
			}
		};
		
		concat2.makeString(s1, s2);
	}

}
