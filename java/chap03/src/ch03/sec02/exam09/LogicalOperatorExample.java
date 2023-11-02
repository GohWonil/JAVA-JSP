package ch03.sec02.exam09;

import java.util.Scanner;

public class LogicalOperatorExample {

	public static void main(String[] args) {

		int charCode = 'A';
			
		Scanner sc = new Scanner(System.in);
		/*Scanner클래스를 이용하여 문자 입력하기
		 * Scanner클래스는 문자 입력기능대신 문자열 기능을 사용합니다.
		 * 문자열 기능을 사용합니다.
		 * 일단 next()함수를 사용하여 문자열을 입력받습니다. 
		 * 그리고 charAt(문자열인덱스)를 사용하여 해당인덱스의 문자를 가져옵니다.
		 *  */
		charCode = sc.next().charAt(0); 
		//sc.next() : 키보드로부터 문자열을 입력
		//문자열.charAt(0): 첫번째 위치의 문자를 가져와라
		//sc.nextInt(): 정수로 입력받는다
		if((charCode >= 65) & (charCode <= 90)) {
			System.out.println("대문자군요.");
		}
	}

}
