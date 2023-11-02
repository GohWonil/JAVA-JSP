package ch05.sec02.exam06;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) throws Exception {

		boolean run = true; //학생점수관리 프로그램 루프
		int studentNum = 0; //학생수 저장 변수
		int[] scores = null; //학생들 점수 관리 변수(배열이용)

		Scanner sc = new Scanner(System.in); //점수입력 및 메뉴 제공 유틸객체

		while (run) { //점수프로그램 관리 루프
			System.out.println("---------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");

		int selectNo = Integer.parseInt(sc.nextLine());

			if (selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = Integer.parseInt(sc.nextLine()); //인트값
				scores = new int[studentNum];
				
			} else if (selectNo == 2) {
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]>");
					scores[i] = Integer.parseInt(sc.nextLine()); //인트값
					}

			} else if (selectNo == 3) {
				for(int i = 0; i <scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
					}
				
			} else if (selectNo == 4) {
				int max = 0;
				int total = 0;
				double avg = 0.0;
				
				for(int i = 0; i < scores.length; i++) {
					max = (max < scores[i]) ? scores[i] : max;
					total =+ scores[i];
					}
				
					avg = (double) total / scores.length;
					
					System.out.println("최고점수: " + max);
					System.out.println("총점: " + total);
					System.out.println("평균: " + avg);
					 
			} else if (selectNo == 5) {
				run = false;
				
				break;
			}
		}
		
		System.out.println("프로그램 종료");

	}
}
