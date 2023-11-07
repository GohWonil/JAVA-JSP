package sec01.exam01.local;

public class A {
	// A 생성자 
	A() {
		System.out.println("A객체가 생성됨");
	}
	
	// 멤버 메소드의 로컬 클래스
	void method() {
		// 로컬클래스 선언
		class D {
			// 로컬클래스 생성자
			D() {
				System.out.println(
					"D 객체가 생성됨!");
				
			}
			
			// 인스턴스 멤버
			int field1;
			void method1() {
				System.out.println(
					"로컬클래스 객체 method1() 호출");
			}
			
			//  정적 멤버
			static int field2;
			static void  method2() {
				System.out.println(
					"로컬클래스 정적 method2() 호출");
			}
		} // 로컬 클래스 D 정의 끝 
		
		// 로컬클래스 사용 
		D d = new D();
		d.field1 = 3;
		d.method1();
		d.field2 = 100;
		d.method2();
	} // mehtod() 정의 끝

}
