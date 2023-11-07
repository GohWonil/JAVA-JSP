package sec01.exam15;

public class StringIndexOfExample {

	public static void main(String[] args) {

		String subject = "자바 프로그래밍";
		
		//프로그래밍을 찾은 위치 인덱스 출력
		int location = subject.indexOf("프로그래밍");
		System.out.println("location: " + location);
		
		//자바라는 단어문자열 찾기
		if (subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책");
		} else {
			System.out.println("자바와 관련없는 책");
		}
	}

}
