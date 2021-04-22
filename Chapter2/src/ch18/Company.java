package ch18;

public class Company {

	private static Company instance = new Company(); //������ ��ü
	
	private Company() {
		
	}
	
	
	//instance �������� �޼��带 ȣ���� ���̱� ������ static���� ����
	public static Company getInstance() {
		
		if(instance == null) {
			
			instance = new Company();
		} //instance�� ������ ��������� ��� ������� �ڵ�

		return instance;
	}
}
