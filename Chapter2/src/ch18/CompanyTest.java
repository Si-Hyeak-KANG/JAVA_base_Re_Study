package ch18;

public class CompanyTest {

	public static void main(String[] args) {

		
		Company company1 = Company.getInstance();
		
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		
		//company1과 company2의 참조값이 같다.
		
	}

}
