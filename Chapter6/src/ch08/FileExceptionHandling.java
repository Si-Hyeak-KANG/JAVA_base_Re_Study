package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {

		FileInputStream fis = null;
		//add throws exception -> 내가 처리안하고 던진다는 의미(throws FileNotFoundException)
		//Surround with try/catch
		
		try {
			fis = new FileInputStream("a.txt");
			System.out.println("read");
			
			
		} catch (FileNotFoundException e) {

			e.printStackTrace(); //어디서 error가 생겼는지 trace
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
		//finally는 항상 불린다.
		System.out.println("end");

	}

}
