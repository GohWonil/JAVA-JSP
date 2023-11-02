package sec01.exam08;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) throws IOException {

		Writer writer = new FileWriter("C:/TEMP/test8.txt");
		
		//문자배열 준비
		char[] array = { '중', '앙', '인', '재', '개', '발', '원' };
		
		//파일에 쓰기
		writer.write(array); //배열의 모든 문자열을 파일에 출력
		
		writer.flush();
		
		writer.close();
	}

}
