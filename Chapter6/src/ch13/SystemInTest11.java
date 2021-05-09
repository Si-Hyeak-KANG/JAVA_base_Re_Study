package ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest11 {

	public static void main(String[] args) {

		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요.");
		
		int i;
		
		try {
			//InputStreamReader는 바이트를 문자로 바꿔주는 클래스 매개변수로 다른 input 스트림을 받음
			InputStreamReader irs = new InputStreamReader(System.in);
			while((i = irs.read()) != '\n') {
					 
				
				System.out.print((char)i); //int로 반환된 i를 다시 문자로 반환	
			}

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
