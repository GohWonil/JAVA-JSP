package ch10.sec01.exam04;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		// 숫자형식의 문자열
		String data1 = "100";
		String data2 = "a100";
		
		// 문자열을 정수로 변환
		int value1 = Integer.parseInt(data1);
		// NumberFormatException 예외 발생
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		System.out.println(
			data1 + " + " + data2 + " = " + result);
		 

	}

}
