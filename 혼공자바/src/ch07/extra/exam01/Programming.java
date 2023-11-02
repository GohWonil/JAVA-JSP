package ch07.extra.exam01;

public class Programming {

	void 연산() {
		System.out.println("연산기능을 실행");
	}
	
	void 입력() {
		System.out.println("데이터를 입력");
	}
	
	void 출력() {
		System.out.println("데이터를 출력");
	}
	
	private void 제어() {
		System.out.println("조건을 비교하여 선택 실행");
	}
	
	private void 반복() {
		System.out.println("정해진 수만큼 반복");
	}
	
	void toDoEnable() {
		
		System.out.println("여기는 Programming객체의 toDoEnable 기능");
		연산();
		입력();
		출력();
		제어();
		반복();
		System.out.println("Programming toDoEnable 기능 끝");

	}
}

