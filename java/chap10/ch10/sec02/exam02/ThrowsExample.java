package ch10.sec02.exam02;

public class ThrowsExample {

	public static void main(String[] args) {
		// findClass() 메소드를 사용
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println(
				"클래스를 발견할 수 없습니다.");
			
		}
	}

	// 실행할 함수를 정의
	// 발생한 예외처리를 외부로 부탁하는 경우
	//   throws 예외종류, ... 구문을 사용
	// 반드시 외부에서 try ~ catch ~ finally로 처리해야함
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");

	}

}
