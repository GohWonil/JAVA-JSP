package example;

public class Example01 {

	private String name;
	private int num;

	void setName(String name) {
		this.name = name;
	}
	
	void setNum(int num) {
		this.num = num;
	}
	
	String getName() {
		return this.name;
	}
	
	int getNum() {
		return this.num;
	}
}

//문제 1 - 다음을 만족하는 Student 클래스를 작성하시오.
//· String형의 학과와 정수형의 학번을 필드로 선언
//· Student 클래스의 main() 메소드에서 Student 객체를 
//생성하여 학과와 학번 필드에 적당한 값을 입력 후 출력