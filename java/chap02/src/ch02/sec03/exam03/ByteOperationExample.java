package ch02.sec03.exam03;

public class ByteOperationExample {

	public static void main(String[] args) {

		byte result1 = 10 + 20;
		System.out.println(result1);
		
		/**
		 * 이 부분은 byte자료형이 자동으로 int 자료형을 자동형변환됩니다.
		 */
		byte x = 10;
		byte y = 20;
		int result2 = x + y;
		System.out.println(result2);
		
	}

}
