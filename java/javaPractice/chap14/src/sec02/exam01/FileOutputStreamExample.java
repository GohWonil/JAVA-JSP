package sec02.exam01;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException {

		//1. 바이트 방식 파일 스트림을 먼저 만듦.
		//	사용예시) FileOutputStream("파일경로", 추가가능여부)
		//추가가능여부: true = 이어서 써라, false = 새로써라
		FileOutputStream output = new FileOutputStream
				("c:/TEMP/StreamData.txt", false);
		
		//2. 이 스트림에 OutputStreamWriter 보조스트림을 연결
		//	바이트방식 스트림을 문자열 스트림처럼 다룬다.
		//new OutputStreamWriter(출력바이트스트림, 인코딩문자형식);
		//출력스트림을 UTF-8 방식으로 변환하여 출력
		//실제로 끝점(End-point)의 출력방식이 파일 출력스트림이라 파일로 저장
		OutputStreamWriter writer = new OutputStreamWriter
				(output, "UTF-8");
		//참조변수를 다른 인코딩방식 객체로 바꾸면???
//		writer = new OutputStreamWriter(output, "EUC-KR");
		
		
		//3. 이 스트림들에 다시 쓰기 속도를 올리기 위해 버퍼를 
		//	이용하여 한번에 버퍼를 쓰기 작업
		BufferedWriter out = new BufferedWriter
				(writer);
		
		//4. 프로그램 => 버퍼쓰기 스트림 => 문자쓰기 스트림 => 바이트쓰기 스트림
		out.write("안녕하세요");
		out.write("\r\n저는 자바입니다.");
		out.append("저는 인터넷에 강한 언어입니다");
		out.append("\n강력한 보안성능을 자랑합니다.");
		
		//5. 입출력 자원 항상 닫기!
		out.close();
		
	}

}
