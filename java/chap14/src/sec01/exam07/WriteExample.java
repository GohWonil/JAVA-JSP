package sec01.exam07;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws IOException {
		
		Writer write = new FileWriter("c:/TEMP/test7.txt");
		
		// 문자 데이터 준비
		char a = 'A';
		char b = 'B';
		char c = 'C';

		//출력스트림에 출력 => 파일로 저장
		write.write(a);
		write.write(b);
		write.write(c);

		write.flush();
		
		write.close();
	}

}