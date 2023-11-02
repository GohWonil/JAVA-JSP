package extra.sec01.exam04;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGameExample {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int rock = 1;
		int scissors = 2;
		int paper = 3;
		
		System.out.print("[가위바위보 게임]\n");
		System.out.print("1.주먹 2.가위 3.보\n");
		System.out.print("사용자가 낸 값 : ");

		int user = sc.nextInt();
		
		Random random = new Random();
		int com = random.nextInt(3)+1;
		System.out.println("컴퓨터가 낸 값 : " + com);
		
		 switch (user) {
         case 1:
             if (com == 1) {
                 System.out.print("무승부입니다.");
             } else if (com == 2) {
                 System.out.print("사용자가 승리하였습니다.");
             } else {
                 System.out.print("컴퓨터가 승리하였습니다.");
             }
             break;

         case 2:
             if (com == 1) {
                 System.out.print("컴퓨터가 승리하였습니다.");
             } else if (com == 2) {
                 System.out.print("무승부입니다.");
             } else {
                 System.out.print("사용자가 승리하였습니다.");
             }
             break;  

         case 3:
             if (com == 1) {
                 System.out.print("사용자가 승리하였습니다.");
             } else if (com == 2) {
                 System.out.print("컴퓨터가 승리하였습니다.");
             } else {
                 System.out.print("무승부입니다.");
             }
             break;

         default:
             System.out.print("잘못된 입력입니다.");
     }
	}
}