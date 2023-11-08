package ch06.sec04.exam05;

public class Car {

	//필드
	int speed;
	
	//생성자
	
	//메소드
	int getSpeed() {
		return speed;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//시동키 작동
	void keyTurnOn() {
		System.out.println("시동키를 돌립니다");	
	}
	
	//자동차를 특정 속력까지 가속한다
	void run() {
		for(int i = 10; i <= 50; i += 10) {
			this.speed = i;
			System.out.println("달립니다.(시속: " + this.speed + "km/h)");
		}
	}
}
