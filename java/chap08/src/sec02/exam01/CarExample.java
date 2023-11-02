package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		myCar.run();
		
		//강제교환으로 해보자
		myCar.frontLeftTire = new KumhoTire();
		myCar.backRightTire = new KumhoTire();
		
		//티이어 교환완료 차를 달려보자
		myCar.run();
		
	}

}
