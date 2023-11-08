package ch02.sec04.exam03;



public class QStipExample {

	public static void main(String[] args) throws Exception {

		int keyCode; 		//1. 키코드를 저장한 변수
		boolean isRunning = true; 		//1.5 키코드 읽기 무한 반복
		while(isRunning) { 		//2. 키코드로 부터 키코드값을 읽어옵니다.
		keyCode = System.in.read(); 		//3. 화면에 출력
		System.out.println("keyCode = " + keyCode); 		//3.5 만약 입력한 키콛가 'q'이면 반복 중지
		if(keyCode == 113) 
		isRunning = !true;
		}
		System.out.println("종료");
}
}