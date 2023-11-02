package sec01.exam01.instance;

public class Main {
	public static void main(String[] args) {
		A a = new A(); // A객체를 생성
		
		// 인스턴스 멤버 클래스 객체 생성
		// A.B : A클래스의 B사용자정의타입
		// A.B b : A.B타입의 참조변수 b선언
		// a.new B(); 
		//   a참조변수가 가르키는
		//   A타입의 객체안에 
		//   중첩클래스 B의 새로운 서브 방을 
		//   만들어라  
		A.B b = a.new B();
		
		// 만들어진 객체를 사용해봅시다.
		b.field1 = 3; // b객체의 filed1에 3대입
		b.method1();
		
		// 중첩클래스 B의 정적필드 
		//  의미상으로 안됨
		A.B.field2 = 100;
		A.B.method2();
		
		
		
	}

}
