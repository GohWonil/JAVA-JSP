package sec01.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteBytesSubExample {

	public static void main(String[] args) throws IOException {

		OutputStream os = new FileOutputStream("c:/temp/test3.db");

		byte[] bytes = {10, 20, 30, 40, 50};

		os.write(bytes, 1, 3); //1번 인덱스부터 시작 3개 출력
		
		os.flush(); //잔여데이터 출력해서 버퍼를 비워
		os.close(); //출력자원 반납
	}

}
