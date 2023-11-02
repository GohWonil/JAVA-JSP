package sec01.exam01.instance;

public class A {
	// 외부 A클래스용 기본 생성자
	A() {
		System.out.println(
  		   "A객체가 생성됨!");
	}
	
	// 인스턴스 멤버 클래스
	class B {
		// 중첩클래스 B용 생성자
		B() {
			System.out.println(
				"B  객체가 생성됨");
		}
		//  중첩클래스 B용 필드
		int field1;
		// 중첩클래스 B용 정적필드도 될까요
		static int field2;
		// 중첩클래스 B용 메소드
		void method1() {
			System.out.println(
				"중첩 객체 B의 method1()실행");
			class inner1 {
				
			}
			
			class inner2 {
				
			}
			
			class inner3 {
				
				class inner4 {
					
				}
				
			}
			
		}
		// 중첩클래스 B용 정적 메소드 가능할까요
		static void method2() {
			System.out.println(
					"중첩 객체 B의 정적 method2()실행");
			
			
			class inner5 {
				
				class inner6 {
					
				}
			}
			
			class inner7 {
				
			}
		}
		
		class C {
			// 중첩클래스 B용 생성자
			C() {
				System.out.println(
					"B  객체가 생성됨");
			}
			//  중첩클래스 B용 필드
			int field1;
			// 중첩클래스 B용 정적필드도 될까요
			static int field2;
			// 중첩클래스 B용 메소드
			void method1() {
				System.out.println(
					"중첩 객체 B의 method1()실행");
			}
			// 중첩클래스 B용 정적 메소드 가능할까요
			static void method2() {
				System.out.println(
						"중첩 객체 B의 정적 method2()실행");
				
			}
		}
			
		static class D {
				// 중첩클래스 B용 생성자
				D() {
					System.out.println(
						"B  객체가 생성됨");
				}
				//  중첩클래스 B용 필드
				int field1;
				// 중첩클래스 B용 정적필드도 될까요
				static int field2;
				// 중첩클래스 B용 메소드
				void method1() {
					System.out.println(
						"중첩 객체 B의 method1()실행");
				}
				// 중첩클래스 B용 정적 메소드 가능할까요
				static void method2() {
					System.out.println(
							"중첩 객체 B의 정적 method2()실행");
					
				}
		}


		
	}
	
	class C {
		void method3() {
			class inner {
				void method() {
					class inner1 {
						
					}
					
					class inner2 {
						
					}
				}
				
				void method2() {
					class inner3 {
						
					}
				}
			}
		}
	}
	
	

}
