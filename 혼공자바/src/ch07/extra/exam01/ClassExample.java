package ch07.extra.exam01;

public class ClassExample {

	public static void main(String[] args) {

		JavaProgramming javaProg = new JavaProgramming();
		
		Programming prog = new Programming();
		
		//객체 정보 출력
		System.out.println(javaProg);
		System.out.println(prog);
		
		//javaProg 객체의 기능 실행
		javaProg.toDoEnable();
		
		System.out.println("================================");
		
		//prog객체의 기능 실행
		prog.toDoEnable();
	}

}
