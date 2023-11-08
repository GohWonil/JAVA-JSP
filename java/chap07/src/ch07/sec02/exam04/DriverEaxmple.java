package ch07.sec02.exam04;

public class DriverEaxmple {

	public static void main(String[] args) {

		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		Truck truck = new Truck("테슬러");
		
		driver.drive(bus);
		driver.drive(taxi);
		driver.drive(truck);
		truck.move();
	}

}
