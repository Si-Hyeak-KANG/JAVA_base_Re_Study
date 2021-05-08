package ch10;

public class PassWordTest {

	private String password;
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) throws PassWordException {
		
		if(password == null) {
			throw new PassWordException("��й�ȣ�� null�� �� �����ϴ�.");
		}
		else if(password.length() < 5) {
			throw new PassWordException("��й�ȣ�� 5�� �̻��̾�� �մϴ�.");
		}
		else if(password.matches("[a-zA-Z]+")) {
			throw new PassWordException("��й�ȣ�� ���ڳ� Ư�����ڸ� �����ؾ� �մϴ�.");
		}
		
		this.password = password;
	}

	
	public static void main(String[] args) {

		PassWordTest test = new PassWordTest();
		
		String password = null;
		
		try {
			test.setPassword(password);
			System.out.println("��������1");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abc";
		
		try {
			test.setPassword(password);
			System.out.println("��������2");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcde";
		
		try {
			test.setPassword(password);
			System.out.println("��������3");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
		
		password = "abcde1#";
		
		try {
			test.setPassword(password);
			System.out.println("��������4");
		} catch (PassWordException e) {
			System.out.println(e.getMessage());
		}
	}

}
