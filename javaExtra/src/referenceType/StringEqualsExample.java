package referenceType;

public class StringEqualsExample {

	public static void main(String[] args) {

		
		//관용적인 표현은 저장공간이 같아진다.
		//스트링형의 기본자료형과 같이 다루기
		
		String strVar1 = "신민철";
		String strVar2 = "신민철";

		if (strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2 참조가 같다");
		} else {
			System.out.println("strVar1과 strVar2 참조가 다르다");
		}
		
		//진짜 값의 내용만 비교하는 경우 내용물만 비교 문자열.equals()이용
		if (strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같다.");
		} else {
			System.out.println("strVar1과 strVar2는 문자열이 다르다.");
		}
		
		//String 객체를 완전히 new String() 생성자를 이용해 생성하기
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");

		if (strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4 참조가 같다");
		} else {
			System.out.println("strVar3과 strVar4 참조가 다르다");
		}
		
		if (strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4 문자열이 같다.");
		} else {
			System.out.println("strVar3과 strVar4 문자열이 다르다.");
		}
	
		System.out.println(strVar1 == strVar3);
		System.out.println(strVar1.equals(strVar3));
		
		//Null이란 가르키는 힙에 내용물이 없다. 
		String hobby = "여행";
		hobby = null;
		System.out.println(hobby);
		

	}
	
}
