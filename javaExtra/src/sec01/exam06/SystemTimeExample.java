package sec01.exam06;

public class SystemTimeExample {

	public static void main(String[] args) {

		long time1 = System.nanoTime(); //시작시간
		
		//측정할 알고리즘
		//1 - 1_000_000 까지의 합
		//누적합 변수
		int sum = 0;
		
		for(int i = 0; i <= 1_000_000; i++) {
			sum += i;
		}
		
		//알고리즘이 끝나면 끝난 시간을 측정
		long time2 = System.nanoTime();
		
		//결과 출력
		System.out.println("1 ~ 1,000,000 까지의 합: " + sum);
		System.out.println("계산에 " + (time2 - time1) + " 나노초가 소요되었습니다.");
		
	}

}
