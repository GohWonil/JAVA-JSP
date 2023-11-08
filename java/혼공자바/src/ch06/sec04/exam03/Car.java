package ch06.sec04.exam03;

public class Car {
	//자동차 연료를 의미하는 필드
	int gas;
	
	//생성자
	
	//메소드
	//gas값을 설정
	void setGas(int gas) {
		this.gas = gas;
	}
	
	//가스가 남아있는가 확인
	//비교하는 메소드이므로 boolean이 적격
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	//자동차 가스가 있는 동안 계속해서 달리는 것을 나타낸다.
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량: " + gas + ")");
				gas--;
			} else {
				System.out.println("멈춥니다.(gas잔량: " + gas + ")");
				return;
			}
		}
	}
}
