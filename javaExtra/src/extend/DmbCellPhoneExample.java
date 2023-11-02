package extend;

public class DmbCellPhoneExample {

	public static void main(String[] args) {

		DmbCellPhone dmb = new DmbCellPhone("자바폰", "검정", 10);
		
		System.out.println("모델: " + dmb.model);
		System.out.println("색상: " + dmb.color);
		System.out.println("채널: " + dmb.channel);
		
		dmb.powerOn();
		dmb.bell();
		dmb.sendVoice(null);
		dmb.receiveVoice(null);
		dmb.sendVoice(null);
		dmb.hangUp();
		dmb.turnOnDmb();
		dmb.changeChanne1Dmb();
		dmb.turnOffDmb();				
	}

}
