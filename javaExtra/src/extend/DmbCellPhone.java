package extend;

public class DmbCellPhone extends CellPhone{

	int channel;
	
	DmbCellPhone(String model, String color, int channel){
		this.channel = channel;
		this.model = model;
		this.color = color;
				
	}
	
	void turnOnDmb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신 시작");
		
	}
	
	void changeChanne1Dmb() {
		System.out.println("채널" + channel + "번으로 바꿉니다.");
		
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
		
	}
	
}
