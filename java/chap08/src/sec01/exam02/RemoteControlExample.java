package sec01.exam02;

public class RemoteControlExample {

	public static void main(String[] args) {

		RemoteControl rc;
		                             
		rc = new Televisoin();
		rc.turnOn();
		rc.setVolume(20);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(-1);
		rc.turnOff();
	}

}
