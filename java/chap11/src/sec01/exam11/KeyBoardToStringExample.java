package sec01.exam11;

import java.io.IOException;

public class KeyBoardToStringExample {

	public static void main(String[] args) throws IOException {

		//키보드로부터 입력받을 최대 글자수
		final int MAX_CHAE_LENGTH = 100;
		//키보드로부터 읽은 바이트를 저장하기 위한 배열
		byte[] bytes = new byte[MAX_CHAE_LENGTH];
		
		//키보드 입력 안내글
		System.out.print("입력: ");
		//배열에 키보드로 부터 입력한 바이트를 저장하고
		//읽은 바이트 수를 리턴 입출력은 무조건 예외가 발생할 수 있어
		//예외처리를 해야한다.
		//자바에서 키보드로 부터 입력을 받는 저장 저수준 코드
		//System.in.read(저장할 바이트배열)
		//키보드 입력의 끝은 입력 내용 "\r\n" 로 구분
		int readNyteNo = System.in.read(bytes);
		
		//키보드로 부터 입력받은 문자들을 변환한 바이트배열을 문자열로 리턴
		//new String(bytes배열, 시작인덱스, 변환할 갯수)
		//바이트배열을 문자열롭 변환
		//readByteno -2 : 문자열변환시 \r \n 필요없으므로 
		String str = new String (bytes, 0, readNyteNo-2);
		System.out.println(str);
	}

}
