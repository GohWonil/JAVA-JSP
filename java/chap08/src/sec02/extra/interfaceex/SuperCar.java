package sec02.extra.interfaceex;

public class SuperCar implements Car, Plain, Ship{

	@Override
	public void startEngine() {
		System.out.println("엔진을 시작합니다.");		
	}

	@Override
	public void stopEngine() {
		System.out.println("엔진을 멈춥니다.");		
	}

	@Override
	public void ship() {
		System.out.println("물위를 떠다닙니다");		
	}

	@Override
	public void fly() {
		System.out.println("비행합니다");		
	}

	@Override
	public void run() {
		System.out.println("고속도로를 달립니다");				
	}

}
