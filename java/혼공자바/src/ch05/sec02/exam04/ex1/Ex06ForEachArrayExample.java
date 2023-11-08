package ch05.sec02.exam04.ex1;

public class Ex06ForEachArrayExample {

	public static void main(String[] args) {

//		1. 5명의 학생의 이름을 변수(배열)에 저장하세요
//		2. 저장된 학생의 이름들을 출력하세요
//			System.out.println();사용하세요
//		3. for~each 구문을 사용하세요
//			데이터 : 학생이름은 황진이, 영희, 홍길동, 무지개, 가을
		
		String[] student = new String[] { 
			"황진이", "영희", "홍길동", "무지개", "가을" 
			};
		
		for (String name : student) {
			System.out.println("학생이름: " + name);
			}
		
	}
}

//int[] numbers = new int[] { 10, 20, 30};
//
////for each 반복문
//for(int num : numbers) {
//	System.out.println("num" + num);
//
//// 단순 반복형 for 반복문
//for(int i = 0; i <numbers.length; i++) {
//	System.out.println("numbers" + numbers[i]);
//	}
