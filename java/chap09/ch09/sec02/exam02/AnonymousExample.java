package ch09.sec02.exam02;

public class AnonymousExample {
	public static void main(String[] args) {
		// 익명객체를 사용할 무대 객체생성
		Anonymous anony = new Anonymous();
		
		// 1. 익명 객체 필드 사용
		anony.field.turnOn();
		anony.field.turnOff();	
		System.out.println(anony.getChannel());
		
		// 2. 익명 객체 로컬 변수 사용
		anony.method1();
		
		// 3. 익명 객체 매개값으로 사용
		anony.method2(
			new RemoteControl() {
				@Override
				public 
				void turnOn() {
					System.out.println("SmartTv를 켭니다.");
				}
				
				@Override
				public
				void turnOff() {
					System.out.println("Smart TV를 끕니다.");
					
				}
				
			});
		

		
	}

	

}
