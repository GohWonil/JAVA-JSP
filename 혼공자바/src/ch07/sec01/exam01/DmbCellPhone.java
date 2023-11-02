package ch07.sec01.exam01;

public class DmbCellPhone extends CellPhone {

	// tv기능을 의미하는 channel변수 선언
	// 필드 추가

	int channel;

	// channel변수 초기화하기 위하여 생성자 추가
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.setColor(color);
		this.channel = channel;
	}
	
	// DmbCellPhone클래스에 필요한 메소드 추가
	// dmbTv를 키다 = turnOnDmb()
	// dmb채널을 변경한다. = changeCannelDmb(int channel)
	// dmbTv를 끄다. turnOffDmb()

	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}

	void chageChnnelDmb(int channel) {
		System.out.println("채널 " + channel + "번 으로 바꿉니다.");
	}

	void turnOffDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 멈춥니다.");
	}

}