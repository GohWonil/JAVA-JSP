package ch07.sec02.exam04;

public class DriverEaxmple {

	public static void main(String[] args) {

		Driver driver = new Driver();
		
		Vehicle vehicle = new Vehicle();
		
		driver.drive(vehicle);
		
		Bus bus = new Bus();
		driver.drive(bus);

		Taxi taxi = new Taxi();
		driver.drive(taxi);

		Truck truck = new Truck("테슬러");
		driver.drive(truck);
		
		truck.move();
	}

}
