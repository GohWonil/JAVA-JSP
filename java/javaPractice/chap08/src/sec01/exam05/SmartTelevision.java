package sec01.exam05;

public class SmartTelevision implements RemoteControl, Searchable{
	//필드
	private int volume;
	
	//메소드
	@Override
	public void search(String url) {
		System.out.println(url + " 을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("전원을 킵니다.");		
	}

	@Override
	public void turnOff() {
		System.out.println("전원을 끕니다.");		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = volume;
		}
		
		//볼륨변경으로 로그 기록
		System.out.println("현재 볼륨: " + this.volume);
	}
}
//모든 추상메소드를 구현, 모두 구현한다면 new 객체 생성 가능