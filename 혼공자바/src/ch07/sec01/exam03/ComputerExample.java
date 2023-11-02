package ch07.sec01.exam03;

public class ComputerExample {

	public static void main(String[] args) {

		//반지름 10
		int r = 10;
		
		//부모클래스 Calculator 객체 생성
		Calculator calculator = new Calculator();
		System.out.println("Calculator 원면적: " + calculator.areaCircle(r));
		
		System.out.println("====================================");
		
		//Computer클래스 객체 생성
		Computer computer = new Computer();
		System.out.println("computer 원면적: " + computer.areaCircle(r));
		
	}

}
