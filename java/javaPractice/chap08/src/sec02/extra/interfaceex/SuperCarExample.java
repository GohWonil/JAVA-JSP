package sec02.extra.interfaceex;

public class SuperCarExample {

	public static void main(String[] args) {
		SuperCar sc = new SuperCar();
		
		sc.startEngine();
		sc.run();
		sc.fly();
		sc.ship();
		sc.stopEngine();
		
		System.out.println("객체를 통한 메소드 호출  -fin- ");
		
		//부모클래스 타입으로 참조변수를 만들어 SuperCar객체를 참조
		//하게 하는 경우
		Vehicle ve = sc; //인터페이스형
		ve.startEngine();
		ve.stopEngine();
		
		Ship sh = sc;
		sh.ship();
		
		Plain pl =sc;
		pl.fly();
		
		System.out.println("인터페이스 형식의 부모참조변수로 변환  -fin-");
		
		//위의 부모타입으로 부터 다시 자식객체로 만든는 경우
		//강제형변환(다운 캐스팅)을 이용
		SuperCar superCar = (SuperCar) ve;
		superCar.startEngine();
		superCar.stopEngine();
		superCar.run();
		superCar.ship();
		superCar.fly();
		
		System.out.println("Vehicle인터페이스 형식을 다시 superCar참보변수로");
		System.out.println("가르키도록(참조) 하는 경우 -fin-");
	}
}
