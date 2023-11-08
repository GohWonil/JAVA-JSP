package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); 다시 강제 타입 변환해야함
		
		Bus bus = (Bus)vehicle; 
		//부모클래스를 버스 타입으로 강제 타입 변환 
		//그래서 지금부터 bus변수는 Bus타입이 됨
		
		bus.run();
		bus.checkFare();
	}

}
