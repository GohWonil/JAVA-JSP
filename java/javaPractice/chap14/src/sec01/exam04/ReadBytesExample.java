package sec01.exam04;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadBytesExample {

	public static void main(String[] args) throws IOException {

		InputStream is = new FileInputStream("C:/TEMP/test2.db");
		//일정크기만큼 한번에 읽어 속도를 높이는 버퍼 설정 
		//버퍼이름 bytes변수 선언
		byte[] bytes = new byte[100];
		//파일처리
		while(true) {
			//파일에서 데이터를 읽어서 bytes배열변수에 넣어라
			//그리고 읽은 객수를 readByteNum변수에 대입
			int readByteNum = is.read(bytes);
			
			//파일로부터 읽은 데이터 처리
			if(readByteNum == -1)
				break;
			for(int i = 0; i < readByteNum; i++) {
				System.out.println(bytes[i]);
			}
		}
		is.close();
	}

}
