package ch18;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {

		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		
		rf.writeInt(100);
		System.out.println("pos: " + rf.getFilePointer()); //4
		rf.writeDouble(3.14);
		System.out.println("pos: " + rf.getFilePointer()); //12 -> 4 + 8
		rf.writeUTF("안녕하세요");
		System.out.println("pos: " + rf.getFilePointer()); //29 한글은 세 바이트씩 12 + 15 + null(2) = 29
		
		System.out.println();
		
		rf.seek(0); // 포지션을 지정
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
			
	}

}
