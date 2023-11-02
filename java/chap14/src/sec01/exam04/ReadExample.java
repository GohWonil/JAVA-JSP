package sec01.exam04;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) throws IOException {
		
		//입력 스트림 생성
		//InputStream클래스는 추상클래스
		//new InputStream() 실행은 불가하고 참조만 가능
		InputStream is = new FileInputStream("C:/TEMP/test.db");
		
		//읽어올 데이터가 없을때까지 ( read() == -1 ) 데이터를 읽는다
		//데이터를 가져오기 위해 while 반복문 사용
		while(true) {
			int data = is.read(); //1바이트씩 읽기
			if(data == -1)
				break; //더 이상 read할 데이터가 없으면 -1을 리턴
			System.out.println(data);
		}
		
		//데이터 읽기 처리가 끝났으면 입출력 자원을 반드시 반납(=close)
		is.close();
		
	}

}
