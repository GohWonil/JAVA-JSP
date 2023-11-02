package ch06.sec04.exam01;

public class CalculatorExample {

	public static void main(String[] args) {

		//계산기 객체 생성
		Calculator calc = new Calculator();
		
		//전원킨다
		calc.powerOn();
		
		//덧셈을 한다
		int returnValue = calc.add(100, 200);
		System.out.println(returnValue);
		
		//나눗셈을 한다
		int returnValue2 = calc.div(100, 3);
		System.out.println(returnValue2);
		
		double returnValue3 = calc.div((double)100, 3);
		System.out.println(returnValue3); 
		
		//전원끈다
		calc.powerOff();
	}

}
