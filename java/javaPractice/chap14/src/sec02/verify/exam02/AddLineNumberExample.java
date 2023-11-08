package sec02.verify.exam02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AddLineNumberExample {

	public static void main(String[] args) throws IOException {

		String filePath = "src/sec02/verify/exam02/AddLineNumberExample.java";

		//filePath경로의 파일을 읽기위한 스트림 생성
		FileReader fr = new FileReader(filePath);
		//메인스트림에 기능을 향상하려는 것
		//메인스트림의 참조변수가 매개변수로 전달 필요
		BufferedReader br = new BufferedReader(fr);
		
		//소스코드를 읽어서 각 코드에 라인넘버 추가
		//소스코드의 줄수 만큼 반복(반복문)
		//반복되는 횟수 정해지지 않았다면 while
		//Reader 문자스트림클래스는 한줄을 읽기 위한 메소드가 있음( readLine() )
		//Reader.readLine() : \r또는\n을 만날때까지 내용을 읽어온다
		
		//Reader.readLine()함수로 한줄 읽은 결과문자열을 저장할 문자열 변수
		//Reader.readLine()으로 결과가 없으면 힙에 문자열객체가 없으니 null반환
		String lineString = null;
		int rowNumber = 0; //처음에 소스코드를 안읽었으므로 0
		while(true) {
			if(	lineString == br.readLine() ){
				break; //더 이상 파일의 내용이 없으니 while루프를 빠져나감
			}
			//파일에서 한줄 읽어 왔으므로 rowNumber = rowNumber + 1
			//rowNumber : 현재 줄수
			//lineString : 파일에서 읽은 한줄
			System.out.println( (++rowNumber) + ": " + lineString);
		} 
		
		//정리
		br.close();
		fr.close();
		
		
	}

}
