package ch06.sec00.string;

public class StringExample1 {

	public static void main(String[] args) {
		// 0123456789012
		String proverb = "A Barking dog"; // new연산자 생략
		String s1; // 문자열 결합
		String s2; // 문자 교환
		String s3; // 부분 문자열
		String s4; // 대문자 교환

		s1 = proverb.concat(" never Bites!"); // ==proverb + " never Bites!"
		s2 = proverb.replace('B', 'b'); // 'B'를 'b'로 고침
		s3 = proverb.substring(0, 5); // 인덱스 2부터 인덱스 5까지 부분 문자열 가져옴
										// 2-4 까지 5번째 안들어감
		s4 = proverb.toUpperCase(); // 대문자로 바꾸기

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);

	}

}
