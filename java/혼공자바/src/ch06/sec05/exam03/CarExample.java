package ch06.sec05.exam03;

public class CarExample {
	String title = "Car프로그램";
	
	public void printString() {
		System.out.println("개발언어는 자바입니다");
	}
		
	//스태틱 필드
	static String writer = "자바";
	
	static void printWriter() {
		System.out.println("개발자: " + writer); 
	}
	//main()는 엔트리포인트(시작점=시작함수)
	public static void main(String[] args) {

		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();

		CarExample ce = new CarExample();
		System.out.println("프로그램 제목은 " + ce.title + "입니다");
		//printString(); 인스턴스 메소드를 혼자 호출
		//실체가 없으므로 메소드를 부를 수 없어 에러
		ce.printString();
		//스태틱 멤버필드와 스태틱 메소드의 경우
		printWriter();
		//객체를 생성하지 않고 인스턴스 멤버를 호출 하려고 하면 컴파일 오류발생
//		System.out.println("프로그램 제목은 " + title + "입니다");
//		printString();
	}

}
