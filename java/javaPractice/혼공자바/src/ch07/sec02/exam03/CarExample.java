package ch07.sec02.exam03;

public class CarExample {

	public static void main(String[] args) {

		Car car =  new Car();
		
		//차를 달려봅니다.
		//달리는 도중 타이어에 문제가 있을 수 있습니다.
		for(int i = 1; i <= 6; i++) {
			int ProblemLocation = car.run();
			
			//문제가 생겼는지 판별
			switch(ProblemLocation) {
			
			case 1:
				System.out.println("앞 왼쪽 한국 타이어 교체");
				car.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;//앞,왼
			
			case 2:
				System.out.println("앞 오른쪽 금호 타이어 교체");
				car.frontRighttTire = new KumhoTire("앞오른쪽", 13);
				break;//앞,오
			
			case 3:
				System.out.println("뒤 왼쪽 한국 타이어 교체");
				car.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;//뒤,왼
			
			case 4:
				System.out.println("뒤 오른쪽 금호 타이어 교체");
				car.backRightTire = new KumhoTire("뒤오른쪽", 14);
				break;//뒤,오
				
			default :
				System.out.println("===================");
				break;//이상없음
			}
			System.out.println("-----------------------------------");
		}
		
	}

}
