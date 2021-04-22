package ch18;

public class Company {

	private static Company instance = new Company(); //유일한 객체
	
	private Company() {
		
	}
	
	
	//instance 생성없이 메서드를 호출할 것이기 때문에 static으로 적용
	public static Company getInstance() {
		
		if(instance == null) {
			
			instance = new Company();
		} //instance가 없으면 생성해줘라 라는 방어적인 코드

		return instance;
	}
}
