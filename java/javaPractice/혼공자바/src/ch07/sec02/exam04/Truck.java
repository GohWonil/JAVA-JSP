package ch07.sec02.exam04;

public class Truck extends Vehicle{
	
	public String model;
	
	public Truck(String model) {
		this.model = model;
	}

	@Override
	public void run() {
		System.out.println(model + "트럭이 달립니다");
	}
	//메소드 추가
	public void move() {
		run();
		System.out.println(model + "트럭이 짐을 싣고");
	}
	
}

