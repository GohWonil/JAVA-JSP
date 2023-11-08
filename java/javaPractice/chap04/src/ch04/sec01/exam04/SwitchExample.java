package ch04.sec01.exam04;

public class SwitchExample {

	public static void main(String[] args) {

		// 1에서 6까지 임의의 주사위 눈금을 생성
		int time = (int) ((Math.random()) * 4 + 8);
		System.out.println("[ 현재 시각: " + time + "시 ]");

		switch (time) {
		case 8:
			System.out.println("출근");
		case 9:
			System.out.println("회의");
		case 10:
			System.out.println("업무");
		default:
			System.out.println("외근");

		}

	}

}