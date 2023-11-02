package sec03.exam04;

public class Creature {
	// 익명클래스를 데이터값으로 가지는 필드
	// Creature의 멤버필드
	Animal dog  = new Animal() {
		public String bark() {
			return "멍멍";
		}
	};
		
	// 이 필드를 사용하는 메소드
	public void method1() {
		System.out.println( 
			"강아지가 " + dog.bark() + "짖습니다.");
	}
	
	public String	method2() {
		return "강아지 울음소리 : " + dog.bark();
	}
}
