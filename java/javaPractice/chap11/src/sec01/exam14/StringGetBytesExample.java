package sec01.exam14;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {

		String str = "안녕하세요";

		// "안녕하세요"문자열을 바이트배열로 만들기
		// 위의 방법을 암호화라고 한다.
		// 원래내용을 어떤 규칙을 이용해 다른 내용으로 만듦

		byte[] bytes1 = str.getBytes();

		System.out.println("byte1내용: ");
		for (var ch : bytes1) {
			System.out.print(ch);
		}
		System.out.println("");
		System.out.println("byte1.lengh: " + bytes1.length);

		// 복호화: 암호화된 내용을 다시 원래내용으로 변경
		// 복호화: Decoding
		String str1 = new String(bytes1);
		System.out.println("byte1 => String: " + str1);

			try {
				
			// 안녕하세요-> "EUC-KR" 배열화
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("byte2.lengh: " + bytes2.length);
			
			//"EUC-KR" 배열화-> 안녕하세요
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("byte2 => String: " + str2);

			
			// 안녕하세요-> "UTF-8" 배열화
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("byte3.lengh: " + bytes3.length);
			
			// "UTF-8" 배열화-> 안녕하세요
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("byte3 => String: " + str3);
			
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
	}
}
