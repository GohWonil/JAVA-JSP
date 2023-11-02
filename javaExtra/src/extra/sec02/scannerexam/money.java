package extra.sec02.scannerexam;

import java.util.Scanner;

public class money {

	public static void main(String[] args) {

		boolean run = true;
		int balabce = 0;
		Scanner sc = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("---------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------------");
			System.out.print("선택> ");

			int a = Integer.parseInt(sc.nextLine());

			if (a == 1) {

				System.out.print("예금액> ");
				int b = Integer.parseInt(sc.nextLine());
				balabce += b;}
			
			else if (a == 2) {
				System.out.print("출금액> " );
				int b = Integer.parseInt(sc.nextLine());
				balabce -= b;}
				
			else if (a == 3) {
				System.out.println("잔고> " + balabce);}

			else if (a == 4) {
				break; }

		}
		
		System.out.println("프로그램 종료");

	}

}
