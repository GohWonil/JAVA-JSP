package ch07.sec01.exam01;

public class DmbCellPhoneExample {

	public static void main(String[] args) {

		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰", "녹색", 10);
		//필드 초기화
		//DmbCellPhone객체를 생성자로 초기화 하여 주석처리
//		dmbCellPhone.color = "보라색";
//		dmbCellPhone.model = "자바폰";
		System.out.println("색상: " + dmbCellPhone.getColor());
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("채널: " + dmbCellPhone.channel);
		
		System.out.println("======================================");
		
		//dmbCellPhone을 작동
		String msg = """
			현재 DmbCellPhone클래스는
				cellPhone클래스부터 상속(extends)받았으나
				아무것도 추가한 것이 없습니다.
			""";
		System.out.println(msg);
		
		//전원을 키고, 벨소리, "여보세요", "안녕하세요!", "아~ 반갑습니다."
		//통화 종료, 전원 끄기 라는 작동을 할 수 있는가?
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.reciveVoice("안녕하세요! 저는 홍길동입니다.");
		dmbCellPhone.sendVoice("아~반갑습니다.");
		dmbCellPhone.hangUp();
		dmbCellPhone.powerOff();
		
		//DmbCellPhone 객체 전용메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.chageChnnelDmb(12);
		dmbCellPhone.turnOffDmb();
	}

}
