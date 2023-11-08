package ch06.sec00.exam03;

import lombok.Getter;
import lombok.Setter;

public class Television { // class는 사용자 정의 데이타

	@Getter // 롬복 클래스
	@Setter // 롬복 클래스

	// 멤버 필드 private 는 꼭 !!!!!! 달아야함
	// 외부에서 접근하지 못하도록 하는 기능
	// 접근을 할때는 허락이 있어야 사용이 된다.
	int channel; // 채널번호
	int voluem; // 음량
	boolean onOff; // 전원
	String owner; // 소유자
	String brand; // 제조원
	int size; // 크기

	//////////////////
	//// 속성메소드///
	/////////////////
//	public int getChannel() {
//		return channel;
//	}
//
//	public void setChannel(int channel) {
//		this.channel = channel;
//	}
//
//	public int getVoluem() {
//		return voluem;
//	}
//
//	public void setVoluem(int voluem) {
//		this.voluem = voluem;
//	}
//
//	public boolean isOnOff() {
//		return onOff;
//	}
//
//	public void setOnOff(boolean onOff) {
//		this.onOff = onOff;
//	}
//
//	public String getOwner() {
//		return owner;
//	}
//
//	public void setOwner(String owner) {
//		this.owner = owner;
//	}
//
//	public String getBrand() {
//		return brand;
//	}
//
//	public void setBrand(String brand) {
//		this.brand = brand;
//	}
//
//	public int getSize() {
//		return size;
//	}
//
//	public void setSize(int size) {
//		this.size = size;
//	}

	// Tv정보출력 기능 메소드
	public void printTvInfo() {
		System.out.println("tv 객체 정보: " + this); // 객체의 자신 의미
		System.out.println("-------------------------");
		System.out.println("tv channel: " + this.channel);
		System.out.println("tv volume: " + this.voluem);
		System.out.println("tv onOff: " + this.onOff);
		System.out.println("tv brnad: " + this.brand);
		System.out.println("tv size: " + this.size);
		System.out.println("tv owner: " + this.owner);
	}

	// channel을 읽어라(read = get)
//	public int getChannel() {
//		return channel;
//	}
//
//	// channel을 바꿔라(change = set)
//	public void setChannel(int channel) {
//		this.channel = channel;
//	}
//	
//	
//	
//	public int getvoluem() {
//		return voluem;
//	}	
//	public void setvoluem(int voluem) {
//		this.voluem = voluem;
//	}
//	
}
