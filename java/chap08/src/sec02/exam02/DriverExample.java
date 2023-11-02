package sec02.exam02;

public class DriverExample {

	public static void main(String[] args) {

		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Train train = new Train();
		
		driver.driver(bus); //자동형변환
		driver.driver(taxi); //자동형변환
		driver.driver(train); //자동형변환

		//메소드 오버로딩 (다형성)
	}

}
