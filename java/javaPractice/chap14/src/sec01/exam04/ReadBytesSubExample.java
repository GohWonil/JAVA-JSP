package sec01.exam04;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadBytesSubExample {

	public static void main(String[] args) throws IOException {

		InputStream is = new FileInputStream("C:/TEMP/test3.db");

		byte[] buffer = new byte[5];

		//입력스트림 is로 부터 3바이트를 읽어서
		//buffer[2], buffer[3], buffer[4]에 각각 저장
		int readByteNum = is.read(buffer, 2, 3);
		//is로 더 이상 읽을 데이터가 없으면 readByteNum은 -1리턴
		
		if(readByteNum != -1) {
			for(int i = 0; i < buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		
		is.close();
	}

}
