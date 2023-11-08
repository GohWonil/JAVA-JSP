package ch06.sec04.exam03;

public class CarExample {

	public static void main(String[] args) {

		//자동차가 달리는 것을 모델링합니다
		//자동차 객체를 만듭니다.
		//기본가스량 주입
		//현재 자동차 가스상태를 검사
		//차를 출발
		//출발한 차가 가스가 있는 동안 달립니다.
		//가스가 남아있으면 가스충전 필요없음 출력
		//가스가 없으면 가스를 새로 주입
		
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("출발");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다");
		} else {
			System.out.println("gas를 주입하세요");
		}
	}

}
