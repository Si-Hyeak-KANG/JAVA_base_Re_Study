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

		long millisecond = 0; //카피 되는 시간
		
		try( BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip"));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"))) {
			//버퍼로 감싸면서 한 바이트씩 읽을 때보다 더 빨라진다.
			
			millisecond = System.currentTimeMillis(); //현재시간
			
			int i;
			
			while( (i=bis.read()) != -1) {
				bos.write(i);
			}
			
			millisecond = System.currentTimeMillis()-millisecond; //수행 완료까지 걸린 시간 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(millisecond + " 소요되었습니다.");
		
		
		//추가적으로..
		Socket socket = new Socket();
		BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		//바이트를 문자로 변경해주는 보조 스트림 위에 버퍼 보조 스트림까지 감싸주면 빨라지기까지 한다.
		
	
	}

}
