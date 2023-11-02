package sec02.exam00;

import java.lang.reflect.Field;

public class ReflectByFieldExample {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {

		//분석할 클래스 가져오기
		Class class1 = Class.forName("sec02.exam00.Child");
		
		//불러온 바이트코드로 부터 검색할 대상이 이번엔 필드
		//리플렉션으로 불러온 Child클래스의 멤버필드 cstr1의 내용 불러오기
		//Class.getDeclaredField("필드명")
		Field field = class1.getDeclaredField("cstr1");
		//cstr1 필드의 시그니쳐 (=선언) 살펴보기
		System.out.println("멤버필드 cstr1의 형식 가져오기: " + field);
		
		//모든 필드정보 다 가져오기
		//Class.getDeclaredField()
		Class class2 = Class.forName("sec02.exam00.Parent");
		Field[] fields2 = class2.getDeclaredFields();
		// fields2배열의 내용 화면 출력
		// 배열 출력은 for ~each 루프 사용
		for(Field field1 : fields2) {
			System.out.println("Parent클래스의 모든 필드변수: " + field1);
		}
		
		//public 필드만 가져오기
		//Class.getField()
		Class class3 = Class.forName("sec02.exam00.Child");
		Field[] fields3 = class3.getFields();
		// fields3의 내용 화면 출력
		for(Field field3 : fields3) {
			System.out.println("Child클래스의 모든 public 필드변수: " + field3);
		}
	}

}
