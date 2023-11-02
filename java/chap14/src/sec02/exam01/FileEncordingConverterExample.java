package sec02.exam01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileEncordingConverterExample {

	public static void main(String[] args) throws IOException {

		//1.변환할 인코딩 파일 읽기 바이트스트림으로 읽어와서
		//내용물이 텍스트이므로 문자스트림리더로 설정
		//버퍼리더로 최종 읽기 속도 향상
		FileInputStream input = new FileInputStream
				("c:/TEMP/StreamData.txt");
		InputStreamReader reader = new InputStreamReader
				(input, "EUC-KR");
		BufferedReader bufferReader = new BufferedReader
				(reader);
		
		//2.읽어온 파일 인코딩변환하여 저장할 파일출력 만들기
		FileOutputStream output = new FileOutputStream
				("c:/TEMP/StreamData-UTF-8.txt");
		OutputStreamWriter writer = new OutputStreamWriter
				(output, "UTF-8");
		BufferedWriter bufferWriter = new BufferedWriter
				(writer);
		
		//3.파일의 내용을 한 글자씩 읽어오면서 출력스트림에 쓰기 작업
		//파일을 읽어오는 반복문 필요 속도를 조금더 올리기 위해 
		//BufferedReader와 별개로 작은 메모리공간(버퍼)를 추가로 만듦
		final int BUFFER_SIZE = 1024;
		char[] chars = new char[BUFFER_SIZE];
		 
		while(true) {
			int readCharNum = bufferReader.read(chars);
			if(readCharNum != -1) {
				bufferWriter.write(chars);
			} else {
				break;
			}
		}
		
		//4.변환이 끝나면 사용한 자원(입력/출력스트림)을 닫습니다.
		bufferWriter.flush();
		
		bufferReader.close();
		bufferWriter.close();
		
		reader.close();
		writer.close();
		
		input.close();
		output.close();

	
	
	}
	

}
