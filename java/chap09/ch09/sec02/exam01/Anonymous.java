package ch09.sec02.exam01;

public class Anonymous {
	/// 필드 : Anonymous클래스(사용자 참조 데이터타입)
	///    의 필드
	// 실제 일을하는 Person클래스의 자식클래스
	//    Worker을 정의합니다.
	// field : Person타입 익명객체를 가르키는
	//    멤버필드
	Person field = new Person() {
		
	    // 필드 초기값으로 익명클래스를 사용
		void work() {
			System.out.println("출근합니다.");
		}
		
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};
	
	// 메소드 변수값으로 익명클래스 사용
	void method1() {
		Person localVar  = new Person() {
			void walk() {
				System.out.println("산책합니다.");
				
			}
			
			void wake() {
				System.out.println(
					"7시에 일어납니다.");
				
				// 로컬클래스의 멤버메소드 호출
				walk();
			}
		};
		
		// 로컬변수 사용(wake() 호출)
		localVar.wake();
	}
	
	
	/// 3. 익명객체를 메소드의 매개변수로 
	///    전달하는 경우 
	///    예) method(익명객체);
	void method2(Person person) {
		// 다형성을 이용한 메소드재정의 실행
		person.wake();
	}
	
	// 실제 클래스를 이용구현
	Person student = new Student();
}
