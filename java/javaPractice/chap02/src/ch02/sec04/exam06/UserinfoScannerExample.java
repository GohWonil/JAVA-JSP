package ch02.sec04.exam06;

import java.util.Scanner;

public class UserinfoScannerExample {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(System.in);
		String name;
		String ssn;
		String tel;
		
		System.out.println("[필수 정보 입력]");
		
		System.out.print("1. 이름: ");
		name = scanner.nextLine();

		System.out.print("2. 주민번호 앞 6자리: ");
		ssn = scanner.nextLine();

		
		System.out.print("3. 전화번호: ");
		tel = scanner.nextLine();

		System.out.println("[입력한 내용]");
		System.out.println(name);
		System.out.println(ssn);
		System.out.println(tel);
		
	}

}
