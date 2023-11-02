package extra.sec02.exam10;

import java.util.Scanner;

public class StringExample01 {

	public static void main(String[] args) {

//		/*
//		 * String 연습1. 
//		 * 학생이름을 키보드로 입력을 받습니다. 
//		 * 학생 국어, 영어, 수학 성적 입력을 받습니다. 
//		 * 총점을 구하고 평균을 구하세요
//		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("학생의 이름을 입력하세요: ");
		String name = sc.next();

		System.out.println("학생의 국어 성적을 입력하세요: ");
		double a = sc.nextDouble();

		System.out.println("학생의 영어 성적을 입력하세요: ");
		double b = sc.nextDouble();

		System.out.println("학생의 수학 성적을 입력하세요: ");
		double c = sc.nextDouble();

		System.out.println("학생 총점: " + (a + b + c));
		System.out.println("학생 평균: " + ((a + b + c) / 3));

	}
}
