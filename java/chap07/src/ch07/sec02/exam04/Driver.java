package ch07.sec02.exam04;

public class Driver {

	public void drive(Vehicle vehicle) {
		System.out.println(vehicle);
		vehicle.run();
	}

	public void drive(Bus bus) {
		System.out.println("bus - " + bus);
		bus.run();
	}

	public void drive(Taxi taxi) {
		System.out.println("taxi - " + taxi);
		taxi.run();
	}
}