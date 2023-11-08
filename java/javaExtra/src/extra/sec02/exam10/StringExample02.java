package extra.sec02.exam10;

import java.util.Scanner;

public class StringExample02 {

	public static void main(String[] args) {

//		/*
//		 * String 연습2 
//		 * 3명의 학생의 이름을 입력받습니다. 
//		 * 3명의 학생 국어, 영어, 수학성적을 입력받습니다. 
//		 * 각 학생의 총점과 평균을 구하세요 
//		 * 각 과목의 총점과 평균을 구하세요
//		 */

		Scanner sc = new Scanner(System.in);

		int min = 0;
		int max = 3;
		int i = 0;
		int j = 0;
		int k = 0;

		while (true) {

			System.out.println("학생의 이름을 입력하세요: ");
			String name = sc.next();

			System.out.println("학생의 국어 성적을 입력하세요: ");
			double a = sc.nextDouble();
			i += a;

			System.out.println("학생의 영어 성적을 입력하세요: ");
			double b = sc.nextDouble();
			j += b;

			System.out.println("학생의 수학 성적을 입력하세요: ");
			double c = sc.nextDouble();
			k += c;

			System.out.println("개인 학생 총점: " + (int)(a + b + c));
			System.out.println("개인 학생 평균: " + (int)(a + b + c) / 3);

			min++;

			if (min >= max) {

				System.out.println("-------------------------");

				System.out.println("종합 국어 과목 총점: " + (int)i);
				System.out.println("종합 영어 과목 총점: " + (int)j);
				System.out.println("종합 수학 과목 총점: " + (int)k);
				System.out.println("종합 국어 과목 평균: " + (int)(i / 3));
				System.out.println("종합 영어 과목 평균: " + (int)(j / 3));
				System.out.println("종합 수학 과목 평균: " + (int)(k / 3));
				break;
			}

		}
	}
}
