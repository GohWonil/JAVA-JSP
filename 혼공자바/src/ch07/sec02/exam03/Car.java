package ch07.sec02.exam03;

public class Car {

	final int CAR_TIRE_PROBLEM_FRONT_LEFT = 1;
	final int CAR_TIRE_PROBLEM_FRONT_RIGHT = 2;
	final int CAR_TIRE_PROBLEM_BACK_LEFT = 3;
	final int CAR_TIRE_PROBLEM_BACK_RIGHT = 4;

	
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRighttTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	int run() {
		System.out.println("[자동차가 달립니다.]");
		
		if(frontLeftTire.roll() == false) {
			stop();
			return CAR_TIRE_PROBLEM_FRONT_LEFT;
		}
		if(frontRighttTire.roll() == false) {
			stop();
			return CAR_TIRE_PROBLEM_FRONT_RIGHT;
		}
		if(backLeftTire.roll() == false) {
			stop();
			return CAR_TIRE_PROBLEM_BACK_LEFT;
		}
		if(backRightTire.roll() == false) {
			stop();
			return CAR_TIRE_PROBLEM_BACK_RIGHT;
		}
		
		return 0;
	}
	
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}

}
