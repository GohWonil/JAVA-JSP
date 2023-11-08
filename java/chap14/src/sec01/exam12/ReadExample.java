package sec01.exam12;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws IOException {

		Reader reader = new FileReader("c:/TEMP/test8.txt");
		
		//파일로부터 읽어온 데이터를 저장할 변수
		char[] buffer = new char[100];
		
		//파일이 끝에 도달할 때까지 읽기 작업 반복
		while(true) {
			int readCharNum = reader.read(buffer);
			
			if (readCharNum == -1) {
				break;
			}
			for(int i = 0; i < readCharNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		reader.close();
	}

}
