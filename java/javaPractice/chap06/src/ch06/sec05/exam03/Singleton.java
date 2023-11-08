package ch06.sec05.exam03;

public class Singleton {

	//외부에서 new를 사용하여 객체를 여러개 생성하는 것을 막는다. 
	//대신 이미 만들어진 객체를 돌려준다.
	
	//구현방법: 클래스내부에서 정적멤버로 자기자신을 변수로 선언 그리고 
	//생성자 private를 선언하여 외부에서 접근 금지. 대신 클래스가 클랫로더에서
	//호출될때 객체를 한번 생성 외부에서 필요할때 마다 생성된 정적 변수를 리턴하는
	//getInstance()메소드 호출
	
	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	//외부에서 이 객체를 부르기 위한 인터페이스 메소드
	//이 클래스의 객체가 static이므로 메소드도 static이어야 한다.
	static Singleton getInstance() {
		return singleton;
	}
	
	
}
