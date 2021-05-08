package ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExeption {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream(fileName);
		
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {

		ThrowsExeption test = new ThrowsExeption();
		
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch(Exception e) {
			//뭔지 모를 다른 exception을 핸들링하기위해 최상위 exception으로 default 처리를 해준다.
			//default 처리는 가장 아래에 표기한다.
		}
		
		System.out.println("end");
		
	}

}
