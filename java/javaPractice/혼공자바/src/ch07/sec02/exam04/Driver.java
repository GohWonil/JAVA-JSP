package ch07.sec02.exam04;

public class Driver {

	public void drive(Vehicle vehicle) {
		vehicle.run();
	}

	public void drive(Bus bus) {
		bus.run();
	}

	public void drive(Taxi taxi) {
		taxi.run();
	}
}