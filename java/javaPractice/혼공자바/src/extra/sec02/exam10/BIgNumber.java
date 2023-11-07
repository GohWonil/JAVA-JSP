package extra.sec02.exam10;

import java.util.Scanner;

public class BIgNumber {

	public static void main(String[] args) {

		/*
		 * 연습문제 1 3개의 정수값을 입력받아 가장 큰수를 구하시오. 정수입력은 Scanner 클래스를 이용하여 키보드로 부터 입력받는다.
		 * 
		 * [출력] 새 정수의 최대값을 구합니다. i의 값 : ) 100 j의 값 : ) 200 k의 값 : ) 300
		 * 
		 * 최대값은 300입니다.
		 */

		int max = 0;  //현재 비교 최대값이 없음
		int i = 100;
		int j = 200;
		int k = 300;
		
		if(i > j) {
			max = i;
		} else if ( i == j ) {
			max = i;
		} else if (i < j) {
			max = j;
		}
		
		if (max > k) {
		} else if (max == k) {
		} else if (max < k) {
			max = k;
		}
		System.out.println(
				"i = " + i + "\n" +
				"j = " + j + "\n" +
				"k = " + k + "\n" + 
				"max = " + max);

		}
}
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int i = 100;
//		int j = 200;
//		int k = 300;
//
//		System.out.println("[입력]");
//		int a = sc.nextInt();
//
//		System.out.println("[출력]");
//		System.out.println("새 정수의 최대값을 구합니다.");
//
//		if (a == i) {
//			System.out.println("i의 값: " + i);
//		}
//
//		else if (a == j) {
//			System.out.println("j의 값: " + j);
//		}
//
//		else if (a == k) {
//			System.out.println("k의 값: " + k);
//		}
//
//		else {
//			System.out.println("값이 없습니다.");
//		}

