package ch04;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringTest {

	public static void main(String[] args) throws ClassNotFoundException {

		Class c = Class.forName("java.lang.String");
		
		Constructor[] cons = c.getConstructors(); //java.lang.String의 생성자들
		
		for(Constructor co : cons) {
			
			System.out.println(co);
		}
		
		Method[] m = c.getMethods();
		
		for(Method me : m) {
			
			System.out.println(me);
		}
	}

}
