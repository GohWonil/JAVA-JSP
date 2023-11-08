package ch07.extra.exam01;

public class JavaProgramming extends Programming {

	void toDoEnable() {
		this.출력();
		this.입력();
		this.연산();
		
		this.제어();
		this.반복();
				
	}
	
	void 제어() {
		System.out.println(
				"제어 상속불가기능 이므로 JavaProgramming 클래서에서 새로 만듦");
	}
	
	void 반복() {
		System.out.println(
				"반복 상속불가기능 이므로 JavaProgramming 클래서에서 새로 만듦");
	}
	
}
