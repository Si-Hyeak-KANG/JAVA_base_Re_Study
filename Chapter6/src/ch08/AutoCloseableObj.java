package ch08;

//AutoCloseable한 클래스
public class AutoCloseableObj implements AutoCloseable{

	@Override
	public void close() throws Exception {

		System.out.println("closing...");
	}

}
