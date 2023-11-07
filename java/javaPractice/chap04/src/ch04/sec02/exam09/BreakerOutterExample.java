package ch04.sec02.exam09;

public class BreakerOutterExample {

	public static void main(String[] args) {

		Outter: for (char upper = 'A'; upper <= 'z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + "-" + lower);
				if (lower == 'g') {
					break Outter;
				}
			}
		}

		System.out.println("프로그램 종료");

	}
}