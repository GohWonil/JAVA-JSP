package ch09.sec01.exam03;

public class A {
	// 인스턴스 멤버 필드
	 int field1;
	// 인스턴스 멤버 메소드
	 void method1() {
		 
	 }
	
	// 정적 멤버 필드
	 static int field2;
	// 정적 멤버 메소드
	 static void method2() {
		 
	 }
	 	 
	 // 인스턴스 멤버 클래스 
	 class B {
		 void method() {
			 field1 = 10;
			 method1();
			 
			 field2 = 10;
			 method2();
		 }
	 }
	 
	 // 정적 멤버 클래스
	 static class C {
		 void method() {
			 field1 = 10;
			 method1();
			 
			 field2 = 10;
			 method2();
		 }
		 
	 }
}
