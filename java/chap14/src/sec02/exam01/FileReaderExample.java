package sec02.exam01;

import java.io.FileReader;

public class FileReaderExample {

	public static void main(String[] args) {
		FileReader fileReader = new FileReader();
		
		//read()가 한글자를 리턴할때 정수값으로 리턴
		
		//파일의 끝에 도착할때까지 계속 반복
		//파일의 끝에 도착하면 -1 리턴
		while(ture) {
			//한 글자씩 입력스트림으로 부터 받아옴
			ch = fileReader.read();
			//파일의 끝 (-1)이면 루프 종료
			if(ch == -1) {
				break;
			}
			//실제 처리하고 싶은 알고리즘 화면 출력
			//입력받은 결과가 int형이므로 문자형으로 형변환
			System.out.println((char)ch);
		} //파일처리 while -끝- 

		//파일 스트림을 열었으면 반드시 자원 반납
		fileReader.close();
	}

}
