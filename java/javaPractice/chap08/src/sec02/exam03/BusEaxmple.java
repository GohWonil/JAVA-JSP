package sec02.exam03;

public class BusEaxmple {

	public static void main(String[] args) {

		//자손클래스 Bus객체를 생성해서 인터페이스
		//Vehicle형의 부모참조변수 vehicle 변수 참조
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		
		Bus bus = (Bus)vehicle; 
		bus.openDoor();
		bus.closeDoor();
		bus.checkFare();

	}

}
