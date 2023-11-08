package ch06.sec00.exam03;

public class MathApp {

	public static void main(String[] args) {

		// Math객체 생성하고 작업
		mathTest mathObj = new mathTest();

		// 덧셈 객체
		int addResult = mathObj.add(2, 3);
		System.out.println(addResult);

		// 뺼셈 객체
		int subResult = mathObj.sub(100, 50);
		System.out.println(subResult);

		// 곱셈 객체
		int mulResult = mathObj.mul(10, 20);
		System.out.println(mulResult);

		// 나눗셈 객체
		int divResult = mathObj.div(100, 50);
		System.out.println(divResult);

		// 나머지 객체
		int modResult = mathObj.mod(100, 3);
		System.out.println(modResult);
	}

}