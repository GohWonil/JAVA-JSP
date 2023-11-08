package sec01.exam00;

public class CalcExample {

	public static void main(String[] args) {
		//인터페이스를 구현한 구현클래스
		//인터페이스의 add()메소드 구현
		CalcWithCalcable calc = new CalcWithCalcable();
		int result = calc.add(100, 200);
		
		System.out.println("result: " + result);
	}

}
