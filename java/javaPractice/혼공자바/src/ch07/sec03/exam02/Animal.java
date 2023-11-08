package ch07.sec03.exam02;

public abstract class Animal {

	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	//울을 소리 내기 추상메소드
	//함수정의가 없고 선언만 있어 불완전(Abstract)하다
	public abstract void sound();
	
}
