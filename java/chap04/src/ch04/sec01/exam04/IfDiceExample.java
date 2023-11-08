package ch04.sec01.exam04;

public class IfDiceExample {

	public static void main(String[] args) {

		//1에서 6까지 임의의 주사위 눈금을 생성
		int a = (int)((Math.random()) * 7 + 1);
		
	
		if (a >= 1 && a <= 6) {
			String msg = a + "번이 나왔습니다.";
			System.out.println(msg);
			
		} else {
			System.out.println("잘못된 값이 나왔습니다.");
		
//			String msg = "번이 나왔습니다.";
			
//		if (a == 1) {
//		System.out.println(a + msg);
//	} else if (a == 2) {
//		System.out.println(a + msg);
//	} else if (a == 3) {
//		System.out.println(a + msg);
//	} else if (a == 4) {
//		System.out.println(a + msg);
//	} else if (a == 5) {
//		System.out.println(a + msg);
//	} else if (a == 6) {
//		System.out.println(a + msg);
//	} else {
//		System.out.println("주사위 번호가 잘못되었습니다.");
//	}
}
		
	}

}
