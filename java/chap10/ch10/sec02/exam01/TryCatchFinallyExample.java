package ch10.sec02.exam01;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			/** 실행을 해보세요 **/
			// Class.forName() : 리플렉션 API라고 해서
			//   자바가 클래스나 객체의 구조를 분석해서 
			//   내부의 구조를 다룰 수 있게 하는 시스템
			//   라이브러리중에서 바이트코드 클래스를 가져와서
			//   메모리에 등록하는 메소드
			Class clazz = Class.forName("java.lang.String2");
		} catch(ClassNotFoundException e) {
			/** 문제가 있으면 여기에서 처리 **/
			System.out.println("클래스가 존재하지 않습니다.");
		} catch(Exception e) {
			// 예외정보를 상세히 모두 알려주세요
			e.printStackTrace();
		}
		
	}
}
