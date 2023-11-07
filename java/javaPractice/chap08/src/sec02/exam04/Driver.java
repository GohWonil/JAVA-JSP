package sec02.exam04;

public class Driver {
	public void drive(Vehicle vehicle) {
		//버스이면 요금을 확인하고 달린다.
		if (vehicle instanceof Bus) { //vehicle 참조변수가 가르키는
			Bus bus = (Bus) vehicle; //객체가 Bus인지 확인
									//Bus객체이면 강제로 Bus객체로 변환	
			bus.checkFare(); 		//자식 객체의 기능을 사용하려함
		}							//자식객체(BUS)의 메소드 사용
		
		//다른 차종은 그냥 달려도된다.
		vehicle.run();
	}
}
