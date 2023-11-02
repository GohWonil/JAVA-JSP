package sec01.exam01.staticclass;

public class Main {

	public static void main(String[] args) {
		// 정적 멤버 클래스 객체 생성
		// 인스턴트 멤버도 포함하고 있으므로 
		//   객체 생성 필요
       A.C c = new A.C();
       c.field1 = 3;
       c.method1();
       A.C.field2 = 100;
       A.C.method2();	}

}

