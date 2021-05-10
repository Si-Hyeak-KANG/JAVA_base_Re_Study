package ch16;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileCopyTest {

	public static void main(String[] args) throws IOException {

		long millisecond = 0; //ī�� �Ǵ� �ð�
		
		try( BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip"));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"))) {
			//���۷� ���θ鼭 �� ����Ʈ�� ���� ������ �� ��������.
			
			millisecond = System.currentTimeMillis(); //����ð�
			
			int i;
			
			while( (i=bis.read()) != -1) {
				bos.write(i);
			}
			
			millisecond = System.currentTimeMillis()-millisecond; //���� �Ϸ���� �ɸ� �ð� 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(millisecond + " �ҿ�Ǿ����ϴ�.");
		
		
		//�߰�������..
		Socket socket = new Socket();
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//����Ʈ�� ���ڷ� �������ִ� ���� ��Ʈ�� ���� ���� ���� ��Ʈ������ �����ָ� ����������� �Ѵ�.
		
	
	}

}
