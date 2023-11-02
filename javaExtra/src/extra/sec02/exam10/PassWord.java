package extra.sec02.exam10;

import java.util.Scanner;

public class PassWord {

	public static void main(String[] args) {

		/*
		 * 연습문제 2. 반복문을 이해하고 있을까요. 키보드로부터 암호를 입력합니다.
		 * 
		 * ㄱ) 암호를 비교하여 같으면 "암호 OK!" ㄴ) 암호가 틀리면 "암호가 틀립니다!. 올바른 암호를 입력해주세요" ㄷ) 암호를 5번 틀리면
		 * "암호를 확인해주세요. 관리자에게 확인해 주세요." 더이상 암호를 입력할 수 없도록 합니다.
		 */

		Scanner sc = new Scanner(System.in);
		String a = "1234";
		int num = 0;
		int max = 5;
		System.out.println("비밀번호: ");

		while (true)

		{
			String pw = sc.nextLine();
			if (a.equals(pw)) {
				System.out.println("암호 OK!");
				break;
			}

			else if (!a.equals(pw)) {
				System.out.println("암호가 틀립니다!. 올바른 암호를 입력해주세요");
				num++;
				if (num >= max) {
					System.out.println("암호를 확인해주세요. 관리자에게 확인해 주세요.");
					break;
				}
			}
		}
	}
}