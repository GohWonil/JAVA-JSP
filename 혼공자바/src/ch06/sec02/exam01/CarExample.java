package ch06.sec02.exam01;

public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car();
		
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);

		myCar.speed = 60;
		System.out.println("현재속도: " + myCar.speed);

		myCar.company = "기아자동차";
		System.out.println("제작회사: " + myCar.company);
		
		////////////////////////////////////////////////
		
		Car myCar1 = new Car();
		
		System.out.println("제작회사: " + myCar1.company);
		System.out.println("모델명: " + myCar1.model);
		System.out.println("색깔: " + myCar1.color);
		System.out.println("최고속도: " + myCar1.maxSpeed);
		System.out.println("현재속도: " + myCar1.speed);

		myCar1.company = "벤츠";
		myCar1.maxSpeed = 350;
		myCar1.speed = 100;
		System.out.println("수정된 제작회사: " + myCar1.company);
		System.out.println("수정된 최고속도: " + myCar1.maxSpeed);
		System.out.println("수정된 현재속도: " + myCar1.speed);
	}

}
