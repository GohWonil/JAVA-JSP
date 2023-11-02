package sec02.exam03;

public class Bus implements Vehicle, VehicleEx{

	//필드
	//버스가 멈추었는지 지켜보는 변수 인터페이스를 설계할때
	//인터페이스의 상태를 모니터링하는 변수를 사용하면 좋다.
	//현재는 버스가 멈추었는가 달리는가를 가르킨다.
	boolean isStop;
	
	//생성자
	Bus() {
		isStop = true;
	}
	
	@Override
	public void run() {
		isStop = false;
		System.out.println("버스가 달립니다.");
		
	}
	//버스 클래스 고유메소드
	public void checkFare() {
		System.out.println("요금을 확인합니다.");
	}
	
	//추상클래스
	public void openDoor() { 
		if (isStop == true ) {
		System.out.println("문을 엽니다.");
	} else {
		stop();}
		System.out.println("문을 닫습니다.");
	}
	
	public void closeDoor() {
		System.out.println("문을 닫습니다.");
	}
	
	public void start() {
		System.out.println("출발합니다.");
	}
	
	public void stop() {
		System.out.println("멈춥니다.");
	}
}
