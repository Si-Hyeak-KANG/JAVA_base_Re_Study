package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest11 {

	public static void main(String[] args) {

		System.out.println("���ĺ� ���� ���� ���� [Enter]�� ��������.");
		
		int i;
		
		try {
			//InputStreamReader�� ����Ʈ�� ���ڷ� �ٲ��ִ� Ŭ���� �Ű������� �ٸ� input ��Ʈ���� ����
			InputStreamReader irs = new InputStreamReader(System.in);
			while((i = irs.read()) != '\n') {
					 
				
				System.out.print((char)i); //int�� ��ȯ�� i�� �ٽ� ���ڷ� ��ȯ	
			}

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
