package sec01.exam02;

// 정상적인 보통 클래스 A  
public class A {
	// 인스턴스 필드
	// 내부 클래스  B C 문제 없음
	B field1 = new B();
	C field2 = new C();
	
	// 정적 필드
	// 클래스 A의 필드로 정적 필드 선언
	/// 외부클래스 A가 만들어 지지 않으므로
	///  B객체를 만들수 없음
	//static B field3 = new B();
	/// static 공유저장소가 따로 있으므로
	/// 나중에 A객체가 참조할 수 있음
	static C field4 = new C();
	
	/// 인스턴스 메소드 사용
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
		
	/// 정적 메소드 사용
	static void method2() {
//		B var1 = new B();
		C var2 = new C();
		
	}
	
   // 이 클래스 A에서만 사용하고 마는 필드입니다. 	
   // 인스턴스 멤버 클래스
   // 클래스 내부에 멤버에 static 사용금지	
   class B {	   
   }
   
   // 이 클래스 A에서만 사용하고 마는 필드입니다.
   // 
   // 정적 멤버 클래스
   // 클래스 내부에 멤버에 인스턴스 + static 사용
   static class C {
	   
   }
   
   
}
