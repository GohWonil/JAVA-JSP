package ch07.sec01.exam06;

public class Car {
	
	//필드
	public int speed;
	
	//메소드
	public void speedUp() {
		speed += 1;
	}
	
	//final 메소드
	public void stop() { //final을 달면 다른 클래스에서 사용이 안됨
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
