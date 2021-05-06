package ch04;

@FunctionalInterface
public interface StringConcat {

	public void makeString(String s1, String s2); 
	//String을 연결해서 출력해주는 인터페이스
}
