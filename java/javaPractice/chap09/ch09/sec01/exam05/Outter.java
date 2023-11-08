package ch09.sec01.exam05;

public class Outter {
	// 바깥클래스 필드
	String field = "Outter-field";
	// 바깥ㅋ틀래스 메소드
	void method() {
		System.out.println("Outter-method");
	}
	
	
	// 중첩(내부) 클래스
	class Nested {
		// 중첩 클래스 필드
		String field = "중첩클래스-필드";
		// 중첩 클래스 메소드
		void method() {
			System.out.println("중첩클래스-메소드");
		}
		
		// 내부클래스와 외부클래스 멤버 출력
		void print() {
			// 중첩클래스 참조
			System.out.println(this.field);
			this.method();
			
			// 바깥(외부) 클래스 멤버 참조
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
	
}
