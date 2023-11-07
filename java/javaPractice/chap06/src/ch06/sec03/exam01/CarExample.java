package ch06.sec03.exam01;

public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car("검정", 3000);

		System.out.println("myCar 객체 생성되었습니다.");
		System.out.println("myCar 객체 정보: " + myCar);

		System.out.println("myCar.color : " + myCar.color);
		System.out.println("myCar.cc : " + myCar.cc);

		System.out.println("===========================");
		
		Car myCar1 = new Car("빨강", 4000);

		System.out.println("myCar 객체 생성되었습니다.");
		System.out.println("myCar 객체 정보: " + myCar1);

		System.out.println("myCar1.color : " + myCar1.color);
		System.out.println("myCar.cc : " + myCar1.cc);

	}

}
