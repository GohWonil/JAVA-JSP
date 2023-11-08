package ch06.sec04.exam05;

public class CarExample {

	public static void main(String[] args) {

		Car car = new Car();
		
		//차에 시동걸기
		car.keyTurnOn();
		
		//차를 달립니다.
		car.run();
		
		//자동차 속도를 얻습니다.
		int speed = car.getSpeed();
		System.out.println("현재 속도: " + speed + "km/h");
	}

}
