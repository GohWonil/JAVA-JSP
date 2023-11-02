package ch09.sec02.exam02;

public class Anonymous {
	// Anonymous 클래스의 필드
	private int channel = 3;
	
	// Anonymous 클래스의 속성메소드
	public void setChannel(int channel) {
		System.out.println("Anonymous || setChannel");
		this.channel = channel;
	}
	
	public int getChannel() {
		System.out.println("Anonymous || getChannel");
		return this.channel;
	}
	
    // 1. 필드 초기값으로 익명 구현 객체 사용
	RemoteControl field = new RemoteControl() {
		// 현재 익명구현 클래스의 내부필드
		public int channel = 3;
		
		// 현재 익명구현 클래스의 내부필드용 
		//   속성메소드
		public void setChannel(int channel) {
			System.out.println("익명구현 객체 || setChannel");
			this.channel = channel;
		}
		
		public int getChannel() {
			System.out.println("익명구현 객체 || getChannel");
			return this.channel;
		}
		
		
		@Override
		public	void turnOn() {
			System.out.println("TV를 켭니다.");
			System.out.println(
				"현재 채널은 " + this.channel);
		}
		
		@Override
		public void turnOff() {
			this.setChannel(7);
			System.out.println(
				"현재 채널을 " + this.getChannel() +
				"로 변경하였습니다.");
			System.out.println("TV를 끕니다.");
		}
		
	};
    
	// 2. 메소드 로컬변수값으로 익명 구현 객체 사용
	void method1() {
		// 로컬변수값으로 익명구현객체 대입
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("Audio 전원을 켭니다.");
				
			}

			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");
				
			}
			
		};
		
		// 로컬객체를 사용하기
		//   참조변수.메소드명();
		localVar.turnOn();
		
	}
	
	
	// 3. 메소드 매개변수값으로 익명 구현 객체 사용
	void method2(RemoteControl rc) {
		rc.turnOn();
		
	}
	
}
