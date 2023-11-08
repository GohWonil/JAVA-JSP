package sec01.exam10;

public class ByteToStringExample {

	public static void main(String[] args) {

		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		//bytes 배열에서 6번째 인덱스에서 시작해서 4개 가져옴
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
		
	}

}
