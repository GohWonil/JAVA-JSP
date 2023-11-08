package sec01.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws IOException {
		//출력스트림 최상위객체(OutputStream)
		//OutputStream: 출력스트림의 최상위부모로 추상클래스
		//FileOutputStream: 파일을 다루는 출력스트림 구현클래스
		//FileOutputStream은 OutputStream의 메소드를 모두 가지고있다(상속)
		OutputStream os = new FileOutputStream("c:/temp/test.db");
		
		//출력할 데이터를 만듭니다.
		//세개의 바이트 변수 선언
		byte a = 10;
		byte b = 20;
		byte c = 30;

		//위의 바이트변수를 출력스트림으로 파일 생성
		os.write(a);
		os.write(b);
		os.write(c);

		//현재 파일출력스트림의 버퍼에 보관중인 데이터 파일로 출력
		os.flush();
		
		//모든 스트림 작업이 끝나면 반드시 공식적으로 닫아주어야함
		//미실시하면 메모리에서 제거가 안됨(메모리 누수)
		os.close();
	}

}
