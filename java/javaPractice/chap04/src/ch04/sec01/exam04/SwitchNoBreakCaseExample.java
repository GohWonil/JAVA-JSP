package ch04.sec01.exam04;

public class SwitchNoBreakCaseExample {

	public static void main(String[] args) {

		//1에서 6까지 임의의 주사위 눈금을 생성
		int a = (int)((Math.random()) * 7 + 1);
		String msg = ("번이 나왔습니다.");
		
		switch(a) {
			case 1:
				msg = a + msg;
				break;
			case 2:
				msg = a + msg;
				break;
			case 3:
				msg = a + msg;
				break;
			case 4:
				msg = a + msg;
				break;
			case 5:
				msg = a + msg;
				break;
			case 6:
				msg = a + msg;
				break;
			default :
				msg = "잘못되었습니다.";
				break;
		} 
		System.out.println(msg);
		
}
		
	}