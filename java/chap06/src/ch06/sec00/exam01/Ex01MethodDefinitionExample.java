package ch06.sec00.exam01;

import java.util.Scanner;

public class Ex01MethodDefinitionExample {
//		자주 반복해서 사용하는 코드들을 대표 이름을 붙여서
//		그 이름으로 부르기만 하면 그 코드들이 실행 -> 함수
//		자바는 모든 함수 클래스에 속해야하므로 그 클래스의
//		함수라는 의미로 메소드라고 함
	static int sum (int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
//		메소드 호출 = 실행 이므로 데이터 값을 리턴합니다
//		연산자와 같다 연산자는 메소드이다
//		메소드계의 스타를 연산자라고 한다
		int sumResult = sum(1, 3); // (1 + 3)의 결과를 sumResult 대입
				
		System.out.println(sumResult);
		System.out.println(sum(1,3));
		
		System.out.println("-------------------------------");
		
		int x = 100;
		int y = 50;
		int divResult = div(x,y);
		
		String msg = """
				#x / #y = #z
				""" 
				.replace("#x", "" + x) 
				.replace("#y", "" + y)
				.replace("#z", "" + divResult);

		System.out.println(msg);
	}
//		public : 외부 코드 블럭에서 불러서 실행
//		private : 가장 강력한 제한범위 지시어로 같은 코드 블럭에서 실행

	private static int div(int x, int y) {
		return x / y;
	}
}
