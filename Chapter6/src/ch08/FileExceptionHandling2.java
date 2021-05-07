package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling2 {

	public static void main(String[] args) {

	
		try(FileInputStream fis = new FileInputStream("a.txt")) {

			System.out.println("read");
						
		} catch (FileNotFoundException e) {
//		FileNotFoundException은 파일이 없을 때 처리되는 Exception
			
			e.printStackTrace();
		} catch (IOException e) {
//		close할 때 처리되는 Exception
			
			e.printStackTrace();
		}
		
		System.out.println("end");

	}

}
