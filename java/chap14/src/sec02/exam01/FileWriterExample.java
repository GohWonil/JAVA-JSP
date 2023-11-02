package sec02.exam01;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {

		FileWriter fileWriter = new FileWriter("c:/TEMP/filedata2.txt");
		
		//이스케이프 문자 \r : 줄의 제일 처음으로 
		//이스케이프 문자 \n : 다음 줄로
		//윈도우즈는 \n만 해도 다음줄로 가서 줄의 제일 처음에 글자 출력
		fileWriter.write("안녕하세요\r\n자바는 재미있습니다.\r\n");
		fileWriter.append("Java is fun!");
		fileWriter.append("\r\nbyebye.");

		//사용다하면 자원 반납
		fileWriter.close();

	}

}
