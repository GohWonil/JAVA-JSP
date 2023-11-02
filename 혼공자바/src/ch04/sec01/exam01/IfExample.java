package ch04.sec01.exam01;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) throws Exception{

		Scanner sc = new Scanner(System.in);
				
		double score = sc.nextDouble();
		char grade = '\u0000';
		
		if(score >= 90) {
			grade = 'A';
			System.out.println("점수가" + score + "점보다 큽니다.");
			System.out.println("등급은" + grade + "입니다.");
			
		}else if(score >= 80 ) {
			grade = 'B';
			System.out.println("점수가" + score + "점보다 큽니다.");
			System.out.println("등급은" + grade + "입니다.");
		
		} else { 
			grade = 'C';
			System.out.println("점수가 80점보다 작습니다.");
			System.out.println("등급은" + grade + "입니다.");}


		}
	}