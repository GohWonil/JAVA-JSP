package sec02.exam00;

import java.io.UnsupportedEncodingException;

public class ResourcePathExample {

	public static void main(String[] args) throws UnsupportedEncodingException {

		//바이트코드가 같은 패키지에 있으므로 간단한 바이트 불러오기
		Class clazz = Car.class;
		
		//photo1.jpg 경로 얻기
		String photo1Path = clazz.getResource("photo1.jpg").getPath();
		System.out.println(photo1Path);
		
		//images/photo2.jpg 경로 얻기
		String photo2Path = clazz.getResource("images/photo2.jpg").getPath();
		System.out.println(photo2Path);
		
		//한글 경로인 경우 경로문자열이 깨어져서 출력 해결
		//보통 리소스 경로명은 인터넷(=네트워크)를 이용해서 
		//자원을 사용하려 할 때 제일 많이 사용
		//자바 네트워크 라이브러리에 만들어져있음.
		//java.net 은 자바 네트워크 관련 기능 라이브러리
		//java.net.URLDecoder : 네트워크를 통해서 문자열을 교환할때
		//문자열을 변환하는 기능
		//java.net.URLDecoder.decode(변환할문자열, "코드체계")
		//변환할문자열을 코드체계(UTF-8등)으로 변환한다.
		
		photo1Path = java.net.URLDecoder.decode(photo1Path, "UTF-8");
		System.out.println(photo1Path);

		photo2Path = java.net.URLDecoder.decode(photo2Path, "UTF-8");
		System.out.println(photo2Path);

	}

}