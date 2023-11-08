package ch01.sec02.exam03;

public class VariableExchangeExample {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
//	교환하기 전 각 변수값 출력확인
		System.out.println("x:" + x + ", y:" + y);
		
//	교환하기
//	교환용 임시변수 준비
//	x값을 temp에 대입
		int temp = x; //x값이 3인 것을 temp에 넣어 temp가 3이됨
		x = y; //y값 3을 x값에 대입하여 x가 3이됨
		y = temp;//temp가 3인 값을 y값에 넣어 y가 3이됨
		System.out.println("x:" + x + ", y:" + y);
	}
}
