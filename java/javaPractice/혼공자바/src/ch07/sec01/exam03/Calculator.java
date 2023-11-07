package ch07.sec01.exam03;

public class Calculator {
	
	//생성자를 안만들면 자바가 기본생성자를 자동으로 추가해줌
	//기본생성자 Calculator(){} 생략됨
	//원의 면적
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
	
}
