package ch06.sec04.exam01;

public class Calculator {

	void powerOn() { 
		System.out.println("전원을 켭니다.");
	}
	//덧셈
	int add(int x, int y) {
		return x + y;
	}
	//뺼셈
	int sub(int x, int y) {
		return x - y;
	}
	//곱셈
	int mul(int x, int y) {
		return x * y;
	}
	//나눗셈(오버로딩): 메소드의 시그니쳐가 다른경우 메소드 시그니쳐에는 메소드
	//선언중 반환값이 안들어감
	double div(double x, double y) {
		return x / y;
	}
	
	//정수 몫만 반환하는 경우
	int div(int x, int y) {
		return x / y;
	}
	
	//나머지
	int mod(int x, int y) {
		return x % y;
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
}
