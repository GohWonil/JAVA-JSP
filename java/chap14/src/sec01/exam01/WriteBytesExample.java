package sec01.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteBytesExample {

	public static void main(String[] args) throws IOException {

		OutputStream os = new FileOutputStream("c:/temp/test2.db");
	
		byte[] bytes = {10, 20, 30};
		
		os.write(bytes); //배열로 모든 바이트 출력
		
		os.flush(); //버퍼를 비워
		os.close(); //출력자원 반납
	
	
	
	}

}
