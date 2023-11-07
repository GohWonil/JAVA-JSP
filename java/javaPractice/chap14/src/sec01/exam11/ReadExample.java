package sec01.exam11;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) throws IOException {

		Reader reader = new FileReader("c:/TEMP/test7.txt");
		
		//파일의 사이즈를 현재 모르니 while 무한 루플
		while(true) {
			int data = reader.read();
			if(data == -1)
				break;
			System.out.println( (char)data );
		}
		
		reader.close();
	}

}
