package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {

		FileInputStream fis = null;
		//add throws exception -> ���� ó�����ϰ� �����ٴ� �ǹ�(throws FileNotFoundException)
		//Surround with try/catch
		
		try {
			fis = new FileInputStream("a.txt");
			System.out.println("read");
			
			
		} catch (FileNotFoundException e) {

			e.printStackTrace(); //��� error�� ������� trace
			System.out.println(e);
			
		} finally {
			
			if(fis != null) {
				try {
					fis. close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println("finally");
		}
		//finally�� �׻� �Ҹ���.
		System.out.println("end");

	}

}
