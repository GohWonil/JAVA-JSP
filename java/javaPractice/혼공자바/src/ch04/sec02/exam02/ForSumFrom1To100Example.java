package ch04.sec02.exam02;

public class ForSumFrom1To100Example {

	public static void main(String[] args) {

		int sum = 0;
		int sum1 = 0;
		
		//1~100까지의 누적 합
//		for(int i = 0; i <=100; i++) {
//			sum += ++i;
//		}

		for (int i = 1; i <= 100; i++) {
		//홀수의 누적 합
			if (((i % 2) == 1)) {
				sum += i;
			}
			System.out.println(sum + i);
		}
	}
}