package ch05.sec02.exam06;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		//기호상수
		//이 부분의 내용은 나중에 enum클래스로 발전하게 됩니다.
		final int MENU_STUDENT_NUMBER = 1;
		final int MENU_SCORE_INPUT = 2;
		final int MENU_SCORE_LIST = 3;
		final int MENU_SCORE_ANALYSIS = 4;
		final int MENU_SCORE_APP_EXIT = 5;
		
		boolean run = true; //학생점수관리 프로그램 루프
		int studentNum = 0; //학생수 저장 변수
		int[] scores = null; //학생들 점수 관리 변수(배열이용)

		Scanner sc = new Scanner(System.in); //점수입력 및 메뉴 제공 유틸객체

		while (run) { //점수프로그램 관리 루프
			System.out.println("---------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------------------------------------");
			System.out.print("선택> ");

			//메뉴 선택
			int selectNo = sc.nextInt();
			
			//선택한 메뉴처리
			//if (selectNo == 1)
			switch(selectNo) {
			//학생수 선택 메뉴와 일치
				case MENU_STUDENT_NUMBER: 
					System.out.print("학생수> "); //학생수라는 프롬프트 출력
					studentNum = sc.nextInt(); //학생수 입력
					scores = new int[studentNum];//학생수가 정해져서 학생 점수 저장할 배열 초기화
					break; //switch에서는 프로그램 흐름 제어에 중요
					
				case MENU_SCORE_INPUT: 
					for(int i = 0; i < scores.length; i++) {
						System.out.print("scores[" + i + "]> ");
						scores[i] = sc.nextInt();
						}
					break;
					
				case MENU_SCORE_LIST:
					for(int i = 0; i <scores.length; i++) {
						System.out.println("scores[" + i + "]: " + scores[i]);
						}
					break;
					
				case MENU_SCORE_ANALYSIS:
					int max = 0;
					int total = 0;
					double avg = 0.0;
					
					for(int i = 0; i < scores.length; i++) {
						max = (max < scores[i]) ? scores[i] : max;
						total = total + scores[i];
						}
					
						avg = (double) total / scores.length;
						
						System.out.println("최고점수: " + max);
						System.out.println("총점: " + total);
						System.out.println("평균: " + avg);					
					break;	

				case MENU_SCORE_APP_EXIT:	
					run = false;		
					break;
			}
		}
		
		System.out.println("프로그램 종료");

	}
}
