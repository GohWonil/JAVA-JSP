package ch06.sec04.exam04;

public class Calculator {

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y) {
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	
	void execute() {
		//자기자신을 의미하는 객체 this
		//만일 실행대상을 확실하게 알고 싶으면
		//this.avg(7, 10)으로 this객체를 붙임
		double result = this.avg(7, 10);
		println("실행결과: " + result);
		
		return; //명령함수에서 끝나는 위치를 정확하게 알고싶을때
	}
	
	private void println(String string) {
		System.out.println(string);
	}
}
