package ch08;

//AutoCloseable�� Ŭ����
public class AutoCloseableObj implements AutoCloseable{

	@Override
	public void close() throws Exception {

		System.out.println("closing...");
	}

}
