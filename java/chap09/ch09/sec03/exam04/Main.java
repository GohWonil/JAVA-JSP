package ch09.sec03.exam04;

public class Main {

	public static void main(String[] args) {
		// Creature클래스를 이용하여 
		//  객체 생성하고 그 객체의 필드에서
		//   익명클래스 사용
		Creature cre = new Creature();
		cre.method1();
		System.out.println( cre.method2() );

	}

}
