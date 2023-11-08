package ch06.sec00.exam02;

public class Television {
	//필드 정의
	int channel; //채널 번호
	int volume; //볼륨
	boolean onOff; //전원 상태
		
	public static void main(String[] args) {
		// 텔레비전 객체 만들기
		// 기본 자료형을 사용하듯 클래스(사용자 데이터자료형)
		// 객체변수명 = new 클래스명();
		// new : 메모리(램)에 방을 새로 만들어라
		// 클래스명(): 생성자라는 메소드로 하는 역할은
		// 방의 크기와 데이터의 방의 종류를 알려준다.
		Television tv = new Television();
		tv.channel = 7;
		tv.volume = 9;
		tv.onOff = true;
		
		System.out.println(
				"화면 채널은 " + tv.channel + "\n" +
				"소리는 " + tv.volume + "\n" +
				"전원상태는 " + tv.onOff
				);
				
	}

}
