package ch07.sec02.exam02;

public class ChildExample {

	public static void main(String[] args) {

		Child child = new Child();

		// 부모 타입으로 자식객체를 가리킴
		Parent parent = child; // 자동으로 타입변환

		// 이 참조 변수로 각 메소드를 부르면
		parent.method1(); // 부모 객체만 가지고있어 부모객체의 메소드가 불림
		parent.method2(); // 자식 객체에서 새로 재정의되어 자식객체의 메소드가 불림
//		parent.method3(); //부모 객체에서는 없는 내용이므로 예외발생
	}

}
