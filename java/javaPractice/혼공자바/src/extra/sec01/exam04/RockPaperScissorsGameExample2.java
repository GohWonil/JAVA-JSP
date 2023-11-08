package extra.sec01.exam04;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGameExample2 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int rock = 1;
		int scissors = 2;
		int parper = 3;

		System.out.print("[가위바위보 게임]\n");
		System.out.print("1.주먹 2.가위 3.보\n");
		System.out.print("사용자가 낸 값 : ");

		int user = sc.nextInt();
		Random random = new Random();
		int com = random.nextInt(3) + 1;
		System.out.println("컴퓨터가 낸 값 : " + com);

		
		if (com == user) {
			System.out.print("무승부입니다.");

		} else if ((user == rock && com == scissors) 
				|| (user == scissors && com == parper)
				|| (user == parper && com == rock)) {
			System.out.print("사용자가 승리하였습니다.");

		} else {
			System.out.print("컴퓨터가 승리하였습니다.");

		}
	}
}